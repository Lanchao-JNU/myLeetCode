package Topic.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations77 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (n==0){
            return res;
        }
        List<Integer> nums= new ArrayList<Integer>(n);

        for (int i=0;i<n;i++){
            nums.add(i+1);
        }
        List<Integer> path = new ArrayList<Integer>();
        bfs(nums,n,k,res,path,1);

        return res;

    }

    public void bfs(List<Integer> nums,int n,int k, List<List<Integer>> res,List<Integer> path,int p){
        if (path.size()==k){
            res.add(new ArrayList<Integer>(path));
            return;
        }

        for(int i=p;i<=n-(k - path.size()) + 1;i++){
            path.add(nums.get(i-1));
            bfs(nums,n,k,res,path,i+1);
            path.remove(path.size()-1);
        }
    }

    public static void main (String[] args){
        Combinations77 solution = new Combinations77();
        List<List<Integer>> res = solution.combine(4,2);
        System.out.println(res);

    }
}
