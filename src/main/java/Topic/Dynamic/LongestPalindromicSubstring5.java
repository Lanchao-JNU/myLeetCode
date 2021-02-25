package Topic.Dynamic;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/2/24
 * \* Time: 6:29 下午
 * \* Description:
 * \
 */
public class LongestPalindromicSubstring5 {
    public String longestPalindrome(String s) {

        //Dp[i][j]=Dp[i+1]Dp[j-1] && s[i]s[j]
        //when j-1-(i+1)<2 stop

        int n= s.length();

        if (n<2) return s;

        boolean [][] dp = new boolean[n][n];

        int max_len=1;
        int start=0;

        for (int j=1;j<n;j++){
            for (int i=0;i<j;i++){
                if (s.charAt(i)==s.charAt(j)){
                    if (j-i<3){
                        dp[i][j]=false;
                    }else{
                        dp[i][j]=dp[i+1][j-1];
                    }
                }else{
                    dp[i][j]=true;
                }

                if (!dp[i][j]){
                    int cur_len=j-i+1;
                    if (cur_len>max_len){
                        max_len=cur_len;
                        start=i;
                    }
                }

            }
        }

        return s.substring(start,start+max_len);


    }

}