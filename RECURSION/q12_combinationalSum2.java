import java.util.*;
public class q12_combinationalSum2 {
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

        Arrays.sort(candidates);
        combinationSum2(0, target, candidates, ans, sublist);

        for(ArrayList<Integer> val : ans){
            System.out.println(val);
        }
    }  
    public static void combinationSum2(int ind, int target, int[] candidates, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> sublist){
        if(target==0){
            ans.add(new ArrayList<>(sublist));
            return;
        }

        for(int i = ind; i<candidates.length; i++){
            if(i>ind && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;

            sublist.add(candidates[i]);
            combinationSum2(i+1, target-candidates[i], candidates, ans, sublist);
            sublist.remove(sublist.size()-1);
        }
    } 
}
