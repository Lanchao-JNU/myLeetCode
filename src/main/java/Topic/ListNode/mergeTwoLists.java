package Topic.ListNode;

import util.ListNode;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/19
 * \* Time: 10:27 上午
 * \* Description:
 * \
 */
public class mergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode head = new ListNode();
        head = result;
        while (l1!=null && l2!=null){
            if (l1.val<l2.val){
                result.next = new ListNode(l1.val);
                l1=l1.next;
            }else{
                result.next = new ListNode(l2.val);
                l2=l2.next;
            }
            result = result.next;
        }

        if (l1!=null){
            result.next = l1;
        }
        if (l2!=null){
            result.next = l2;
        }
        return head;
    }
}