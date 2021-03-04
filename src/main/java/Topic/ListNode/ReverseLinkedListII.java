package Topic.ListNode;

import util.ListNode;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/1
 * \* Time: 10:37 上午
 * \* Description:
 * \
 */
public class ReverseLinkedListII {

    public ListNode reverseBetween(ListNode head,int m,int n) {
        if (m==1){
            return reverseN(head,n);
        }
        head.next = reverseBetween(head.next,m-1,n-1);
        return head;

    }

    ListNode follower = null;
    public ListNode reverseN(ListNode head,int n){

        if (n==1){
            follower = head.next;
            return head;
        }

        ListNode last = reverseN(head.next,n-1);

        head.next.next=head;
        head.next=follower;
        return last;
    }
}