package Topic.Tree;

import util.TreeNode;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/19
 * \* Time: 6:58 下午
 * \* Description:
 * \
 */
public class mirrorTree {
    public TreeNode mirrorTree(TreeNode root) {
        if (root==null){
            return null;
        }
        TreeNode left = new TreeNode();
        TreeNode right = new TreeNode();
        left = mirrorTree(root.left);
        right = mirrorTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}