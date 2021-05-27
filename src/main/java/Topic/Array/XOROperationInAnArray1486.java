package Topic.Array;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/5/7
 * \* Time: 10:31 上午
 * \* Description:
 * \
 */

//ez ^-^
public class XOROperationInAnArray1486 {
    public int xorOperation(int n, int start) {
        int result = 0;
        for (int i=0;i<n;i++){
            result = result^(start+2*i);
        }
        return result;

    }
}