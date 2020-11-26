package util;

import java.util.ArrayList;

public  class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    public ListNode() {
    }

    public ListNode ArraytoListNode (int [] array){
        int length = array.length;
        ListNode head = new ListNode(-1);
        ListNode headTemp = head;
        for (int i=0;i<length;i++){
            head.next = new ListNode(array[i]);
            head = head.next;
        }
        head.next = null;
        return headTemp.next;
    }

    public ArrayList<Object> ListNodetoArrayList(ListNode head){
        ArrayList <Object> list = new ArrayList<Object>();
        while (head!=null){
            list.add(head.val);
            head = head.next;
        }
        return list;

    }
}
