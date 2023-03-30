import java.util.*;
public class q6_oneSubsequenceEqualsK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k : ");
        int k = sc.nextInt();

        List<Integer> ans = new ArrayList<>();
        int sum = 0;
        helper(arr, 0, ans, k, sum);
        System.out.println(ans);
    }
    public static Boolean helper(int[] arr, int i, List<Integer> ans, int k, int sum){
        if(i>=arr.length){
            if(k==sum){
                return true;
            }
            return false;
        }

        ans.add(arr[i]);
        sum+=arr[i];
        if(helper(arr, i+1, ans, k, sum)==true) return true;
        sum-=arr[i];
        ans.remove(ans.size()-1);

        if(helper(arr, i+1, ans, k, sum)==true) return true;

        return false;
    }
}














// import java.util.*;
// public class oneSubsequenceEqualsK {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Enter k : ");
//         int k = sc.nextInt();

//         List<List<Integer>> ans = new ArrayList<>();
//         List<Integer> subset = new ArrayList<>();
//         int sum = 0;
//         helper(arr, 0, ans, subset, k, sum);
//         System.out.println(ans);
//     }
//     public static Boolean helper(int[] arr, int i, List<List<Integer>> ans, List<Integer> subset, int k, int sum){
//         if(i>=arr.length){
//             if(k==sum){
//                 ans.add(new ArrayList<>(subset));
//                 return true;
//             }
//             return false;
//         }

//         subset.add(arr[i]);
//         sum+=arr[i];
//         if(helper(arr, i+1, ans, subset, k, sum)==true) return true;
//         sum-=arr[i];
//         subset.remove(subset.size()-1);

//         if(helper(arr, i+1, ans, subset, k, sum)==true) return true;

//         return false;
//     }
// }
