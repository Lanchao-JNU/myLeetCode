package Topic.math;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/12
 * \* Time: 11:00 上午
 * \* Description:
 * \
 */
public class Fibonacci {
    public int fib(int n) {
        int a=0;
        int b=1;
        int tmp=0;

        for (int i=0;i<n;i++){
            tmp = (a+b)%1000000007;
            a=b;
            b=tmp;

        }
        return a;

    }
}