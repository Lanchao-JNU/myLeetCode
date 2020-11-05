package Topic.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationsII47 {

    public List<List<Integer>> permuteUnique(int [] nums){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Integer len = new Integer(nums.length);
        if (len==0){
            return res;
        }
        List<Integer> path = new ArrayList<Integer>();
        boolean [] used = new  boolean [len];
        bfs(nums,len,path,0,res,used);

        return res;

    }

    public void bfs(int[] nums,Integer len, List<Integer> path,Integer deep,List<List<Integer>> res,boolean [] used){
        if (deep.equals(len)){
            for (List<Integer> item: res){
                if (path.equals(item)){
                    return;
                }
            }

            res.add(new ArrayList<Integer>(path));
            return;
        }

        for (int i=0;i<len;i++){
            if (!used[i]){
                used[i]=true;
                path.add(nums[i]);

                bfs(nums,len,path,deep+1,res,used);
                path.remove(path.size()-1);
                used[i] = false;

            }
        }


    }

    public static void  main (String [] args){
        int [] nums = {1,1,2};
        PermutationsII47 solution = new PermutationsII47();
        List<List<Integer>> res = solution.permuteUnique(nums);
        System.out.println(res);

    }

}
