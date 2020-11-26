package Topic.ListNode;

import util.ListNode;

public class PartitionList86 {
    public ListNode partition(ListNode head, int x) {
        ListNode lower = new ListNode(-1);
        ListNode higher = new ListNode (-1);
        ListNode tempLower = lower;
        ListNode tempHigher = higher;


        while (head!=null){
            if (head.val<x){
                lower.next = new ListNode (head.val);
                lower = lower.next;
            }else{
                higher.next = new ListNode (head.val);
                higher = higher.next;
            }
            head = head.next;
        }

        lower.next = tempHigher.next;
        return tempLower.next;


    }

    public static void main(String[] args){
        PartitionList86 solution = new PartitionList86();
        ListNode head = new ListNode(1);
        head.next=new ListNode(4);
        head.next.next=new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);;
        head.next.next.next.next.next.next = null;
        ListNode res = solution.partition(head,3);
        while (res.next !=null){
            System.out.println(res.val);
            res=res.next;
        }
        System.out.println(res.val);





    }
}
