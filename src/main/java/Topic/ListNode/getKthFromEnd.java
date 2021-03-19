package Topic.ListNode;

import util.ListNode;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/18
 * \* Time: 12:31 下午
 * \* Description:
 * \
 */
public class getKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (k==0) return head;

        ListNode fast = new ListNode();
        ListNode slow = new ListNode();
        fast.next = head;
        slow.next = head;
        while (k!=0){
            fast = fast.next;
            k-=0;
        }
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }

        return slow;





    }
}