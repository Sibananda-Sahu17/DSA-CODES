import java.util.*;
public interface q8_permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> perm = new ArrayList<>();
        permutation(nums, 0, ans, perm);
        
        for(List<Integer> val: ans){
            System.out.println(val+ " ");
        }
    }
    public static void permutation(int[] nums, int pos, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> perm){
        if(pos>=nums.length){
            perm = new ArrayList<>();
            for(int x: nums){
                perm.add(x);
            }
            ans.add(new ArrayList<>(perm));
        }

        for(int i = pos; i<nums.length; i++){
            swap(nums, i, pos);
            permutation(nums, pos+1, ans, perm);
            swap(nums, i, pos);
        }
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
