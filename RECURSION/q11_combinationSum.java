import java.util.*;
public class q11_combinationSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candidates = new int[n];
        for(int i = 0; i<n; i++){
            candidates[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> sublist = new ArrayList<>();
        findCombinations(0, target, candidates, ans, sublist);

        for(ArrayList<Integer> val : ans){
            System.out.println(val);
        }
    }
    public static void findCombinations(int i, int target, int[] candidates, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> sublist){
        if(target==0){
            ans.add(new ArrayList<>(sublist));
            return;
        }
        if(target<0) return;
        if(i==candidates.length){
            return;
        }

        sublist.add(candidates[i]);
        findCombinations(i, target-candidates[i], candidates, ans, sublist);
        sublist.remove(sublist.size()-1);

        findCombinations(i+1, target, candidates, ans, sublist);
    }
}
