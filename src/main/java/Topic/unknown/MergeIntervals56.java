package Topic.unknown;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals56 {

    public int[][] merge(int[][] intervals) {

        Integer len = intervals.length;
        if (intervals.length == 0) {
            return new int[0][2];
        }

        List<int []> res = new ArrayList<int []>();

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]==o2[0]) return o1[1]-o2[1];
                return o1[0]-o2[0];

            }
        });
        for (int i=0;i<len;){
            int right = intervals[i][1];
            int t=1;
            while (i+t<len&&right>=intervals[i+t][0]){
                right = Math.max(right,intervals[i+t][1]);
                System.out.println(right);
                t++;
            }
            res.add(new int [] {intervals[i][0],right});
            i+=t;

        }
        return res.toArray(new int[][]{});

    }

    public static void main (String[] args){
        MergeIntervals56 solution = new MergeIntervals56();
        int [][] intervals = {{1,4},{0,2},{3,5}};
        int [][] res = solution.merge(intervals);
        for(int [] a:res){
            System.out.println ( Arrays.toString (a));
        }
    }



}


