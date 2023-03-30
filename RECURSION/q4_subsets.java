import java.util.*;
public class subsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        helper(arr, 0, ans, subset);
        for(List<Integer> val:ans){
            System.out.println(val+ " ");
        }
    }
    public static void helper(int[] arr, int i, List<List<Integer>> ans, List<Integer> subset){

        if(i>=arr.length){
            ans.add(new ArrayList<>(subset));
            return ;
        }
        subset.add(arr[i]);
        helper(arr, i+1, ans, subset);
        subset.remove(subset.size()-1);
        
        helper(arr, i+1, ans, subset);

    }
}
