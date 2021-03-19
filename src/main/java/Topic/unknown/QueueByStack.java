package Topic.unknown;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/12
 * \* Time: 10:29 上午
 * \* Description:
 * \
 */
public class QueueByStack {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public  QueueByStack() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public void appendTail(int value) {
        stack1.push(value);

    }

    public int deleteHead() {
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()){
            return -1;
        }else{
            return stack2.pop();
        }

    }
}