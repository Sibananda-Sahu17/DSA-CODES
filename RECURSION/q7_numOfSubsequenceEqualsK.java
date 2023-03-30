import java.util.*;
public class q7_numOfSubsequenceEqualsK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k : ");
        int k = sc.nextInt();
        int ans = countSubsequenceEqualsK(arr, 0, k, 0);
        System.out.println("The number of subsequences whose sum equals k are : "+ans);
    }
    public static int countSubsequenceEqualsK(int[] arr, int i, int k, int sum){

        if(i==arr.length){
            if(k==sum) return 1;
            return 0;
        }
        sum+=arr[i];
        int l = countSubsequenceEqualsK(arr, i+1, k, sum);
        sum-=arr[i];

        int r = countSubsequenceEqualsK(arr, i+1, k, sum);
        return l+r;
    }
}
