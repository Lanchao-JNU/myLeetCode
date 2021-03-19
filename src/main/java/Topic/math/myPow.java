package Topic.math;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/17
 * \* Time: 7:53 下午
 * \* Description:
 * \
 */
public class myPow {
    public double myPow(double x, int n) {
        if (n==0) return 1;
        double res = myPow(x,n/2);

        if (n>0){
            if (n%2==1){
                return res*res*x;
            }else{
                return res*res;
            }

        }else{
            n=-n;
            if (n%2==1){
                return res*res*1/x;
            }else{
                return res*res;
            }

        }


    }
}