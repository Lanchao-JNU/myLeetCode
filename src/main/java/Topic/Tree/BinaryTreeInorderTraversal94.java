package Topic.Tree;


import util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/4
 * \* Time: 10:33 上午
 * \* Description:
 * \
 */
public class BinaryTreeInorderTraversal94{

    //递归
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        inOrder(root,result);
        return result;

    }

    public void inOrder(TreeNode root,List<Integer> result){
        if (root == null) return ;

        inOrder(root.left,result);
        result.add(root.val);
        inOrder(root.right,result);

    }

    public List<Integer> inorderStack(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root==null) return result;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(root!=null||!stack.isEmpty()){
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
            root = stack.pop();
            result.add(root.val);
            root=root.right;


        }

        return result;
        }



}