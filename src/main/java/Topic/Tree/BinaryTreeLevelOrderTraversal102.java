package Topic.Tree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/5
 * \* Time: 10:48 上午
 * \* Description:
 * \
 */
public class BinaryTreeLevelOrderTraversal102 {
    public List<List<Integer>> levelOrder(TreeNode root) {



        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root==null) return result;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> tmpList = new ArrayList<Integer>();
            int levelSize = queue.size();

            for (int i=0;i<levelSize;i++){
                TreeNode tmpNode = queue.poll();

                tmpList.add(tmpNode.val);
                if (tmpNode.left!=null) queue.offer(tmpNode.left);
                if (tmpNode.right!=null) queue.offer(tmpNode.right);

            }

            result.add(tmpList);

        }
        return result;



    }
}