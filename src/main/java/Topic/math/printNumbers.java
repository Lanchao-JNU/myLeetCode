package Topic.math;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/18
 * \* Time: 10:59 上午
 * \* Description:
 * \
 */
public class printNumbers {
    public int[] printNumbers(int n) {
        double maxNum = Math.pow(10,n);
        int[] list = new int[(int)maxNum];
        int i=0;
        while(i<maxNum){
            list[i]=i;
            i++;

        }

        return list;


    }
}