import java.util.*;
public class q5_allSubsequenceEqualsK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        int sum = 0;
        helper(arr, 0, ans, subset, 2, sum);
        for(List<Integer> val:ans){
            System.out.println(val+ " ");
        }
    }
    public static void helper(int[] arr, int i, List<List<Integer>> ans, List<Integer> subset, int k, int sum){

        if(i>=arr.length){
            if(sum==k){
                ans.add(new ArrayList<>(subset));
            }
            return ;
        }

        subset.add(arr[i]);
        sum+=arr[i];
        helper(arr, i+1, ans, subset, k, sum);
        sum-=arr[i];
        subset.remove(subset.size()-1);
        
        helper(arr, i+1, ans, subset, k, sum);

    }
}
