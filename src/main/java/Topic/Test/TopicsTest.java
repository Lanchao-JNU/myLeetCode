package Topic.Test;

import util.ListNode;

import java.util.ArrayList;

public class TopicsTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        ListNode node = new ListNode();
        ListNode res = node.ArraytoListNode(array);
        ArrayList <Object> list= node.ListNodetoArrayList(res);
        System.out.println(list);

    }

}
