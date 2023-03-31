import java.util.ArrayList;
import java.util.Scanner;

public class q10_combinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //---------range [1,n]
        int n = sc.nextInt();
        //---------combinations of size k
        int k = sc.nextInt();

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        combinations(1, n, k, ans, new ArrayList<>());
        
        for(ArrayList<Integer> val : ans){
            System.out.println(val);
        }
    }
    public static void combinations(int i, int n, int k, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> sublist){
        if(sublist.size()==k){
            ans.add(new ArrayList<>(sublist));
            return;
        }
        // if(k > (n-i+1)){
        //     return;
        // }
        if(i>n){
            return;
        }

        sublist.add(i);
        combinations(i+1, n, k, ans, sublist);
        sublist.remove(sublist.size()-1);

        combinations(i+1, n, k, ans, sublist);
    }
}
