package Topic.Tree;

import util.TreeNode;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/4
 * \* Time: 6:31 下午
 * \* Description:
 * \
 */
public class SameTree100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q!=null) return false;
        if (p!=null && q==null) return false;
        if (p==null && q==null) return true;
        return (p.val==q.val)&& isSameTree(p.left,q.left) && isSameTree(p.right,q.right);


    }
}