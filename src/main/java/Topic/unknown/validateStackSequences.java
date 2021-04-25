package Topic.unknown;

import java.util.Stack;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/22
 * \* Time: 7:32 下午
 * \* Description:
 * \
 */
public class validateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<Integer>();
        int pushLength = pushed.length;
        int poppedLength = popped.length;
        if (pushLength==0) return true;
        stack.push(pushed[0]);
        int i = 1;
        int j = 0;
        while (j!=poppedLength-1){
            if (!stack.isEmpty()&&j<poppedLength && popped[j]==stack.peek()){
                stack.pop();
                j++;
            }else if (i==pushLength){
                return false;
            }else {
                stack.push(pushed[i]);
                i++;
            }
        }
        return true;


    }
}