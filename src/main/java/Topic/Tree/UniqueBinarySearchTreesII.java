package Topic.Tree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/4
 * \* Time: 1:12 下午
 * \* Description:
 * \
 */
public class UniqueBinarySearchTreesII {

    public List<TreeNode> generateTrees(int n) {
        if(n==0) return new ArrayList<TreeNode>();
        return generateTrees(1,n);
    }

    public List<TreeNode> generateTrees(int start,int end ) {
        List<TreeNode> allTree = new ArrayList<TreeNode>();
        if (start>end){
            allTree.add(null);
            return allTree;
        }
        for (int i=start;i<=end;i++){
            List<TreeNode> leftTrees = generateTrees(start, i-1 );
            List<TreeNode> rightTrees = generateTrees(i+1,end);

            for (TreeNode left:leftTrees){
                for (TreeNode right:rightTrees){
                    TreeNode currentTree = new TreeNode(i);
                    currentTree.left = left;
                    currentTree.right=right;
                    allTree.add(currentTree);
                }
            }

        }
        return allTree;
    }



}