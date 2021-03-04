package Topic.ListNode;

import util.ListNode;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/1
 * \* Time: 11:51 上午
 * \* Description:
 * \
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        if (head ==null || head.next==null){
            return head;
        }
        ListNode numb = reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return numb;

    }
}