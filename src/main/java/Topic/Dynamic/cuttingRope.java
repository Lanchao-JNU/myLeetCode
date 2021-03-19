package Topic.Dynamic;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/16
 * \* Time: 1:54 下午
 * \* Description:
 * \
 */
public class cuttingRope {
    public int cuttingRope(int n) {
        int[] Dp = new int[n + 1];
        Dp[2] = 1;
        Dp[1] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 2; j < i; j++) {

                Dp[i] = Math.max(Dp[i], Math.max(j * (i-j), j * Dp[i - j]));


            }


        }
        return Dp[n];
    }
}