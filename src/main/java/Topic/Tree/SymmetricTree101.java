package Topic.Tree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/4
 * \* Time: 7:07 下午
 * \* Description:
 * \
 */
public class SymmetricTree101 {
    public boolean isSymmetric(TreeNode root) {
        if (root==null) return false;
        return isSymmetric(root.left,root.right);

    }

    public boolean isSymmetric(TreeNode left,TreeNode right) {
        if (left==null && right!=null) return false;
        else if (left!=null && right==null) return false;
        else if (left==null && right==null) return true;


        return (left.val==right.val) && isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);

    }


}