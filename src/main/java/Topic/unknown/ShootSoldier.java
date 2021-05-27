package Topic.unknown;

import util.ListNode;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/5/1
 * \* Time: 3:54 下午
 * \* Description:
 * \
 *
 *
 * 杀死士兵
 * m
 */


public class ShootSoldier {
    public static void main(String[] args) {
        int [] soldiers = new int [] {1,2,3,4,5,6,7,8};
        int lastSoldier = LastSoldier(soldiers,3);
        System.out.println(lastSoldier);





    }

    public static int LastSoldier (int [] soldiers,int m){
        ListNode result = new ListNode();
        ListNode head = new ListNode();
        result = head;

        for (int soldier: soldiers){
            ListNode node = new ListNode(soldier);
            head.next = node;
            head = head.next;



        }
        ListNode pre =null;
        head.next = result.next;
        head = result.next;


        ListNode cur = head;

        int current = 1;


        while (head.next!=head) {
            if (current==m){
                current = 1;
                pre.next = cur.next;
                cur = pre.next;

            }else {
                pre = cur;
                cur = cur.next;
                current += 1;
            }


        }

        return head.val;




    }

}