package Topic.ListNode;

import util.TreeNode;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/19
 * \* Time: 1:07 下午
 * \* Description:
 * \
 */
public class isSubStructure {
        public boolean isSubStructure(TreeNode A, TreeNode B) {

            if (B==null || A==null) return false;
            return  isSubStructure(A.left,B) || isSubStructure(A.right,B) || isLikeTree(A,B);
        }

        public boolean isLikeTree(TreeNode A,TreeNode B){

            if (A==null && B==null){
                return true;
            }
            if (A==null && B!=null){
                return false;
            }
            if (A!=null && B==null){
                return true;
            }
            return A.val==B.val && isLikeTree(A.left,B.left) && isLikeTree(A.right,B.right);
        }
    }

