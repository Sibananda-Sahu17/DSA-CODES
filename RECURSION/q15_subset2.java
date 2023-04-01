//----No duplicates-----

import java.util.*;
public class q15_subset2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> sublist = new ArrayList<>();
        helper(0, arr, ans, sublist);
        for(ArrayList<Integer> val: ans){
            System.out.println(val);
        }
    }
    public static void helper(int idx, int[] arr, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> sublist){
        ans.add(new ArrayList<>(sublist));

        for(int i = idx; i<arr.length; i++){
            if(i>idx && arr[i]==arr[i-1]) continue;

            sublist.add(arr[i]);
            helper(i+1, arr, ans, sublist);
            sublist.remove(sublist.size()-1);
        }
    }
}
