package Topic.ListNode;

import util.ListNode;

public class RotateList61 {
    public ListNode rotateRight(ListNode head, int k) {

        ListNode numb1 = new ListNode(0);
        numb1.next=head;
        Integer len = 0;

        while (numb1.next !=null){
            numb1 = numb1.next;
            len++;
        }

        if (len<=1|| k==0|| k%len==0){
            return head;
        }else{
            ListNode numb = new ListNode(0);
            numb.next = head;
            Integer t = len-k%len;
            while (t>0){
                numb = numb.next;
                t--;
            }
            ListNode temp = numb.next;
            numb.next = null;
            ListNode res = new ListNode(0);
            res.next=temp;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=head;

            return res.next;
        }

    }



    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = null;
        RotateList61  solution = new RotateList61();
        ListNode res = solution.rotateRight(head,7);
        while (res.next !=null){
            System.out.println(res.val);
            res=res.next;
        }
        System.out.println(res.val);




    }

}





