package Topic.Tree;

import util.TreeNode;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/19
 * \* Time: 7:06 下午
 * \* Description:
 * \
 */
public class isSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        return isSymmetric(root.left,root.right);


    }
    public boolean isSymmetric(TreeNode left,TreeNode right) {
        if (left==null && right==null) return true;
        if (left!=null && right==null) return false;
        if (left==null && right!=null) return false;
        return left.val==right.val && isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);



    }

}