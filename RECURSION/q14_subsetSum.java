import java.util.*;
public class q14_subsetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        helper(0, arr, ans, 0);
        for(int val: ans){
            System.out.print(val+ " ");
        }
    }
    public static void helper(int i, int[] arr, ArrayList<Integer> ans, int sum){
        if(i==arr.length){
            ans.add(sum);
            return;
        }

        sum+=arr[i];
        helper(i+1, arr, ans, sum);
        sum-=arr[i];

        helper(i+1, arr, ans, sum);
    }
}
