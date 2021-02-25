package Topic.ListNode;

import util.ListNode;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/2/24
 * \* Time: 5:47 下午
 * \* Description:
 * \
 */
public class AddTwoNumbers2 {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode current =result;

        int carry=0;

        while (l1!=null || l2!=null){
            int x=0;
            if (l1!=null){
                x=l1.val;
            }
            int y=0;
            if (l2!=null){
                y=l2.val;
            }

            int value = x+y+carry;
            carry=value/10;
            value = value%10;

            if (l1!=null)l1=l1.next;
            if (l2!=null)l2=l2.next;

            current.next = new ListNode(value);
            current=current.next;


        }
        if (carry==1) current.next=new ListNode(1);
        return result.next;


    }
}