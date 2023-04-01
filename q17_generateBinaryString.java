import java.util.*;
public class q17_generateBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String> ans = new ArrayList<>();
        helper(n, ans, "");

        System.out.println(ans);
    }
    public static void helper(int n , ArrayList<String> ans, String s){
        if(s.length()==n){
            ans.add(s);
            return;
        }

        helper(n, ans, s+'0');
        if(s.length() > 0 && s.charAt(s.length()-1)!=1 || s.length()==0){
            helper(n, ans, s+'1');
        }
    }
}
