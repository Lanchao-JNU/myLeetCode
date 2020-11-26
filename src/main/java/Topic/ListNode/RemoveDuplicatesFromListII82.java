package Topic.ListNode;

import util.ListNode;

public class RemoveDuplicatesFromListII82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null || head.next == null){
            return head;
        }

        if (head.val == head.next.val){
            while (head !=null && head.next!=null && head.val==head.next.val){
                head = head.next;
            }
            return deleteDuplicates(head.next);

        }else{
            head.next = deleteDuplicates(head.next);
            return head;
        }


    }

    public static void main(String[] args) {
        RemoveDuplicatesFromListII82 solution = new RemoveDuplicatesFromListII82();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);

        head.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next = null;
        ListNode res = solution.deleteDuplicates(head);
        while (res.next != null) {
            System.out.println(res.val);
            res = res.next;
        }
        System.out.println(res.val);

    }
}