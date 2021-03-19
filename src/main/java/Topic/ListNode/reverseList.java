package Topic.ListNode;

import util.ListNode;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/18
 * \* Time: 12:44 下午
 * \* Description:
 * \
 */
public class reverseList {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = null;
        while (cur!=null){
            next = cur.next;
            cur.next=pre;
            pre = cur;
            cur=next;

        }
        return pre;


    }
}