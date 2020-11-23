package Topic.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class WordSearch79 {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (board[i][j]==word.charAt(0)){ ;
                    Integer record = 1;
                    boolean res = dfs(i,j,board,record,word);
                    if (res == true) return true;
                }

            }
        }

        return false;
    }

    public  boolean  dfs(int i, int j,char[][] board,int record,String word){

        if (record == word.length()) return true;
        boolean res = false;
        char tempChar = board[i][j];
        board[i][j]='#';

        if (i+1<=board.length-1 && board[i+1][j]==word.charAt(record))
        {
            res=dfs(i+1,j,board,record+1,word);
            if (res==true) return true;
        }


        if (i-1>=0 && board[i-1][j]==word.charAt(record))
        {
            res=dfs(i-1,j,board,record+1,word);
            if (res==true) return true;
        }


        if (j-1>=0 && board[i][j-1]==word.charAt(record))
        {
            res=dfs(i,j-1,board,record+1,word);
            if (res==true) return true;
        }


        if (j+1<=board[0].length-1 && board[i][j+1]==word.charAt(record))
        {
            res=dfs(i,j+1,board,record+1,word);
            if (res==true) return true;
        }

        board[i][j]=tempChar;
        return res;
    }

    public static void main(String [] args){
        WordSearch79 solution = new WordSearch79();
        char [][] board = {{'C','A','A'},{'A','A','A'},{'B','C','E'}};
        String word = "AAB";
        boolean res = solution.exist(board,word);
        System.out.println(res);
    }
}
