package Topic.Tree;

import apple.laf.JRSUIUtils;
import util.TreeNode;

import java.util.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/5
 * \* Time: 2:10 下午
 * \* Description:
 * \
 */
public class BinaryTreeZigzagLevelOrderTraversal103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) return result;
        Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
        nodeQueue.offer(root);
        boolean ifLeft = true;
        while (!nodeQueue.isEmpty()){
            int size = nodeQueue.size();
            Deque<Integer> resultDeque = new LinkedList<Integer>();
            for (int i=0;i<size;i++){
                TreeNode current = nodeQueue.poll();
                if (ifLeft){
                    resultDeque.offerLast(current.val);

                }else{
                    resultDeque.offerFirst(current.val);
                }
                if (current.left!=null) nodeQueue.offer(current.left);
                if (current.right!=null) nodeQueue.offer(current.right);


            }
            ifLeft=!ifLeft;
            result.add((List<Integer>) resultDeque);
        }


        return result;


    }

}