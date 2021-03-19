package Topic.Tree;

import util.TreeNode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/9
 * \* Time: 10:55 上午
 * \* Description:
 * \
 */
public class ReBuildBinaryTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int length = preorder.length;
        if (length==0) return null;
        int rootVal = preorder[0];
        TreeNode root = new TreeNode(rootVal);
        if (length==1) {
            return root;
        }
        int middle = findFirstValue(inorder,rootVal);
        if (length==2) {
            int val = preorder[1];
            if (middle==0) {
                root.left=null;
                root.right=new TreeNode(val);
            }
            else{
                root.right=null;
                root.left = new TreeNode(val);
            }
        }
        else {
            int[] leftInOrder = Arrays.copyOfRange(inorder, 0, middle);
            int[] rightInOrder = Arrays.copyOfRange(inorder, middle + 1, inorder.length );
            int[] leftPreOrder = Arrays.copyOfRange(preorder, 1, middle+1);
            int[] rightPreOrder = Arrays.copyOfRange(preorder, middle + 1, preorder.length);
            TreeNode left = buildTree(leftPreOrder, leftInOrder);
            TreeNode right = buildTree(rightPreOrder, rightInOrder);
            root.left = left;
            root.right = right;
        }
        return root;


    }

    private int findFirstValue (int[] list,int obj ){
        int length=list.length;
        for (int i=0;i<list.length;i++){
            if (list[i]==(obj)){
                return i;
            }
        }
        NullPointerException  exception = new NullPointerException();
        throw (exception);

    }


    //官方答案 递归

    HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

    public TreeNode BuildTreeAuth(int [] preorder,int [] order,int preorder_left,int preorder_right,int inorder_left,int inorder_right){
        if (preorder_left>preorder_right){
            return null;
        }
        int preorder_root = preorder_left;
        int inorder_root = map.get(preorder[preorder_left]);
        TreeNode root = new TreeNode(preorder[preorder_left]);
        int left_size = inorder_root-inorder_left;
        root.left = BuildTreeAuth(preorder,order,preorder_left+1,preorder_left+left_size,inorder_left,inorder_root-1);
        root.right = BuildTreeAuth(preorder,order,preorder_left+1+left_size,preorder_right,inorder_root+1,inorder_right);
        return root;

    }


    public TreeNode BuildTree(int[] preorder, int[] inorder){
        int n=inorder.length;
        for (int i=0;i<n;i++){
            map.put(inorder[i],i);
        }
        return BuildTreeAuth(preorder,inorder,0,n-1,0,n-1);

    }

}