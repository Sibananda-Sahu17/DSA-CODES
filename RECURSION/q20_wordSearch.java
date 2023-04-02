import java.util.*;
public class q20_wordSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        //------word string------
        System.out.println("Enter the word string to be searched:");
        String word = sc.next();
        
        char[][] board = new char[m][n];
        System.out.println("Enter the 2d array: ");
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                board[i][j] = sc.next().charAt(0);
            }
        }

        
        boolean ans = false;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(board[i][j]==word.charAt(0)){
                    if(search(i, j, m, n, board, word, 0)){
                        ans=true;
                        System.out.println(ans);
                        break;
                    }
                }
            }
            if(ans) break;
        }
        if(!ans) System.out.println(ans);
        
    }
    public static boolean search(int i, int j, int m, int n, char[][] board, String word, int k){
        if(k==word.length()) return true;
        if(i<0 || j<0 || i==m || j==n ||  board[i][j]!=word.charAt(k)) return false;

        char ch = board[i][j];
        board[i][j] = '#';
        boolean op1 = search(i, j+1, m, n, board, word, k+1);
        boolean op2 = search(i+1, j, m, n, board, word, k+1);
        boolean op3 = search(i, j-1, m, n, board, word, k+1);
        boolean op4 = search(i-1, j, m, n, board, word, k+1);
        board[i][j] = ch;

        return op1 || op2 || op3 || op4;
    }
}
