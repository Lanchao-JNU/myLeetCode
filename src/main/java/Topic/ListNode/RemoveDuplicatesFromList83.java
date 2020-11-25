package Topic.ListNode;

import util.ListNode;

public class RemoveDuplicatesFromList83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode numb = head;

        while (numb!=null && numb.next != null ){
            if (numb.next.val==numb.val){
                numb.next = numb.next.next;
            }else {
                numb = numb.next;
            }
        }

        return head;

    }

    public static void main(String[] args){
        RemoveDuplicatesFromList83 solution = new RemoveDuplicatesFromList83();
        ListNode head = new ListNode(1);
        head.next=new ListNode(1);
        head.next.next=new ListNode(1);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = null;
        ListNode res = solution.deleteDuplicates(head);
        while (res.next !=null){
            System.out.println(res.val);
            res=res.next;
        }
        System.out.println(res.val);



    }
}
