import java.util.*;
public class q13_combinationSum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Enter ans sublist size k
        int k = sc.nextInt();
        // Enter ans sublist sum n
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> sublist = new ArrayList<>();
        helper(1 , k, n, ans , sublist);
        
        for(List<Integer> val : ans){
            System.out.println(val);
        }
    }
    public static void helper(int i, int k, int n, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> sublist){
        if(sublist.size()==k){
            if(n==0){
                ans.add(new ArrayList<>(sublist));
                return;
            }
            return;
        }

        if(n<0) return;
        if(i>=10) return;
        
        sublist.add(i);
        helper(i+1, k, n-i, ans, sublist);
        sublist.remove(sublist.size()-1);

        helper(i+1, k, n, ans, sublist);
    }
}
