package Topic.Backtracking;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/15
 * \* Time: 11:55 上午
 * \* Description:
 * \
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        boolean res = false;
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                if (board[i][j]==word.charAt(0)){
                    res =  dfs(i,j,1,board,word);
                    if (res==true) return true;
                }
            }
        }
        return false;

    };

    public boolean dfs(int i,int j,int record,char[][] board,String word){
        if (record==word.length()) return true;
        char target = word.charAt(record);
        char basic = board[i][j];
        board[i][j] = '#';
        int length = board.length;
        int size = board[0].length;
        boolean res = false;

        if (i+1<=length-1 && board[i+1][j] == target){
            res = dfs(i+1,j,record+1,board,word);
            if(res == true) return true;
        }
        if (i-1>=0 && board[i-1][j] == target){
            res = dfs(i-1,j,record+1,board,word);
            if(res == true) return true;
        }
        if (j+1<=size-1 && board[i][j+1] == target){
            res = dfs(i,j+1,record+1,board,word);
            if(res == true) return true;
        }
        if (j-1>=0 && board[1][j-1] == target){
            res = dfs(i,j-1,record+1,board,word);
            if(res == true) return true;
        }
        board[i][j] = basic;

        return false;

    }
}