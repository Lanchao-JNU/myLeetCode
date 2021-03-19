package Topic.Dynamic;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/12
 * \* Time: 11:29 上午
 * \* Description:
 * \
 */
public class JumpingFrog {
    public int numWays(int n) {
        if (n==0) return 0;
        int a = 1;
        int b = 2;
        int cur=0;
        for (int i=0;i<=n-2;i++){
            cur=a+b+2;
            a=b;
            b=cur;
        }
        return cur%1000000008;

    }
}