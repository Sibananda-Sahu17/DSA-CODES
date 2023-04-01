import java.util.*;
public class q16_letterCombinationsPhoneNumbers {
    public static String[] str = new String[]{"", "", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        ArrayList<String> ans = new ArrayList<>();
        helper(0, s, ans, "");

        System.out.println(ans);
    }
    public static void helper(int idx, String s, ArrayList<String> ans, String combination){
        if(idx==s.length()){
            ans.add(combination);
            return;
        }

        int curr = s.charAt(idx)-'0';
        String temp = str[curr];
        for(int i = 0; i<temp.length(); i++){
            combination+=temp.charAt(i);
            helper(idx+1, s, ans, combination);
            combination = combination.substring(0, combination.length()-1);
        }
    }
}
