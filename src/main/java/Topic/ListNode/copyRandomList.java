package Topic.ListNode;


import java.util.HashMap;
import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/4/1
 * \* Time: 11:20 上午
 * \* Description:
 * \
 */
class Node {
     int val;
     Node next;
     Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class copyRandomList {
    public Node copyRandomList(Node head) {
        if (head==null) return null;
        Node current = new Node(0);
        current = head;
        Map<Node,Node> map = new HashMap();
        while (current!=null){
            map.put(current,new Node(current.val));
            current = current.next;
        }
        current = head;
        while (current!=null){
            map.get(current).next = map.get(current.next);
            map.get(current).random = map.get(current.random);
            current = current.next;
        }
        return map.get(head);


    }
}