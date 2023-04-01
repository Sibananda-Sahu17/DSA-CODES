import java.util.*;
public class q18_generateParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String> ans = new ArrayList<>();
        paranthesis(n, ans, "", 0, 0);

        System.out.println(ans);
    }
    
    public static void paranthesis(int n, ArrayList<String> ans, String s, int open , int close){
        if(s.length()==n*2){
            ans.add(s);
            return;
        }

        if(open<n){
            paranthesis(n, ans, s+'(', open+1, close);
        }
        if(close<open){
            paranthesis(n, ans, s+')', open, close+1);
        }
    }
}
