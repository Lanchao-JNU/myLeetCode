package Topic.Tree;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/31
 * \* Time: 11:26 上午
 * \* Description:
 * \
 */
public class verifyPostorder {
    public boolean verifyPostorder(int[] postorder) {
        return verifyPostorder(postorder,0,postorder.length-1);

    }

    public boolean verifyPostorder(int[] postorder,int left,int right) {
        if (left>=right) return true;
        int root = postorder[right];
        int i=left;
        while (postorder[i]<root) i++;
        int middle = i;
        while (postorder[i]>root) i++;
        return i==right && verifyPostorder(postorder,left,middle-1) && verifyPostorder(postorder,middle,right-1);

    }
}