package Topic.Tree;

import util.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/4
 * \* Time: 4:58 下午
 * \* Description:
 * \
 */
public class ValidateBinarySearchTree98 {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }


    public boolean isValidBST(TreeNode root,long left,long right) {
        if (root==null) return true;
        if (root.val<=left || root.val>=right){
            return false;
        }
        return isValidBST(root.left,left,root.val) && isValidBST(root.right,root.val,right);

    }


}