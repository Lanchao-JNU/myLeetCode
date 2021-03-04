package Topic.Tree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/4
 * \* Time: 2:02 下午
 * \* Description:
 * \
 */
public class UniqueBinarySearchTrees96 {
    public int numTrees(int n) {
        if(n==0) return 1;
        int [] G = new int [n+1];
        G[0]=1;
        G[1]=1;
        for (int i=2;i<=n;i++){
            for (int j=1;j<=i;j++){
                G[i] += G[i-j]*G[j-1];
            }
        }
        return G[n];

    }


}