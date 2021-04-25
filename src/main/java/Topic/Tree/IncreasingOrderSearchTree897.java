package Topic.Tree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/4/25
 * \* Time: 7:59 下午
 * \* Description:
 * \
 */
public class IncreasingOrderSearchTree897 {
    public TreeNode increasingBST(TreeNode root) {
        List<TreeNode> list = new ArrayList();
        Inorder(root,list);
        for (int i=0;i<list.size()-1;i++){
            list.get(i).left=null;
            list.get(i).right=list.get(i+1);
        }
        list.get(list.size()-1).left=null;
        list.get(list.size()-1).right=null;
        return list.get(0);

    }

    public void Inorder(TreeNode root,List<TreeNode> list){
        if (root==null) return;
        Inorder(root.left,list);
        list.add(root);
        Inorder(root.right,list);


    }
}