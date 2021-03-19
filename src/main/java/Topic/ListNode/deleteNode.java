package Topic.ListNode;

import util.ListNode;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/18
 * \* Time: 11:09 上午
 * \* Description:
 * \
 */
public class deleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode numb = new ListNode();
        ListNode res = new ListNode();
        res = numb;
        numb.next = head;
        while (numb!=null &&numb.next!=null){
            if (numb.next.val==val){
                numb.next=numb.next.next;
            }
            numb=numb.next;
        }
        return res.next;

    }
}