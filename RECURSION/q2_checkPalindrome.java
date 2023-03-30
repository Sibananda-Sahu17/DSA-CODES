import java.util.*;
public class q2_check_palindrome_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(checkPalindrome(0, s));            
    }
    public static boolean checkPalindrome(int i, String s){
        int n = s.length();
        if(i>=n/2) return true;
        if(s.charAt(i)!=s.charAt(n-i-1)) return false;
        return checkPalindrome(i+1, s);
    }
}
