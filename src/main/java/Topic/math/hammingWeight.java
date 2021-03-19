package Topic.math;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/17
 * \* Time: 7:42 下午
 * \* Description:
 * \
 */
public class hammingWeight {
    public int hammingWeight(int n) {
        int res = 0;
        while (n!=0){
            if((n&1)==1){
                res+=1;

            }
            n=n>>1;
        }
        return res;

    }
}