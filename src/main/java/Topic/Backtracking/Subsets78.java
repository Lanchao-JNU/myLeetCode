package Topic.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets78 {

    public List<List<Integer>> subsets(int [] nums){

        List<List<Integer>> res = new ArrayList<List<Integer>>();

        Integer len = nums.length;
        if (len==0){
            return res;
        }
        Arrays.sort(nums);
        List<Integer> path = new ArrayList<Integer>();
        bfs(nums,len,res,path,0);
        return res;
    }
    public void bfs(int [] nums,Integer len,List<List<Integer>> res,List<Integer> path,Integer p){
        res.add(new ArrayList<Integer>(path));
        if(len==path.size()&&p==3){
            return;
        }

        for (int i=p;i<len;i++){
            path.add(nums[i]);
            bfs(nums,len,res,path,i+1);
            path.remove(path.size()-1);

        }
    }

    public static void main(String[] args){

        Subsets78 solution = new Subsets78();
        int[] nums = {1,2,3};
        List<List<Integer>> res = solution.subsets(nums);
        System.out.println(res);


    }
}
