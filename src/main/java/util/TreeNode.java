package util;



/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/4
 * \* Time: 10:33 上午
 * \* Description:
 * \
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(){};
    public TreeNode(int val){ this.val = val;}
    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}