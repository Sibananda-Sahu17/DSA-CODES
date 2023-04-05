import java.util.*;
public class q9_permutations2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i =0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> perm = new ArrayList<>();
        permutation(nums, 0, ans, perm);

        for(ArrayList<Integer> x : ans){
            System.out.println(x);
        }
    }
    public static void permutation(int[] nums, int pos, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> perm){
        if(pos>=nums.length){
            perm = new ArrayList<>();
            for(int x: nums){
                perm.add(x);
            }
            ans.add(perm);
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i = pos; i<nums.length; i++){
            if(set.contains(nums[i])) continue;

            set.add(nums[i]);
            swap(nums, i, pos);
            permutation(nums, pos+1, ans, perm);
            swap(nums, i, pos);
        }
    }
    public static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
