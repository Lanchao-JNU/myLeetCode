package Topic.Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/5/21
 * \* Time: 下午3:39
 * \* Description:
 * \
 */
//public class combinationSum {
//
//    List<List> result = new ArrayList<>();
//    public List<List<Integer>> combunation(int []arr,int target){
//        List<Integer> current = new ArrayList<>();
//
//    }
//
//    public void dfs(int [] arr,int start,int target,List<Integer> current){
//        if (target<0) return ;
//        if (target==0){
//            if (!result.contains(current)){
//                result.add(current);
//            }
//            return ;
//        }
//
//        for (int i=start;i<arr.length;i++){
//            current.add(arr[i]);
//            dfs(arr,start+1,target-arr[i],current);
//            current.remove(current.size()-1);
//        }
//    }
//
//}