import java.util.*;
public class q19_palindromePartitioning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        ArrayList<String> substrings = new ArrayList<>();
        helper(0, s, ans, substrings);

        System.out.println(ans);
    }
    public static void helper(int idx, String s, ArrayList<ArrayList<String>> ans, ArrayList<String> substrings){
        if(idx==s.length()){
            ans.add(new ArrayList<>(substrings));
            return;
        }
    
        for(int i = idx; i<s.length(); i++){
            if(isPalindrome(s, idx, i)){
                substrings.add(s.substring(idx, i+1));
                helper(i+1, s, ans, substrings);
                substrings.remove(substrings.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
