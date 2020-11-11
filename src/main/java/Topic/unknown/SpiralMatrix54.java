package Topic.unknown;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {
    public List<Integer> spiralOrder(int[][] matrix) {

        Integer m = matrix.length;
        if (m==0){
            return new ArrayList<Integer>() {
            };
        }

        Integer n = matrix[0].length;
        if (n==0){
            return new ArrayList<Integer>() {
            };
        }

        Integer size = m*n;
        ArrayList<Integer> res = new ArrayList<Integer>();
        Integer t=0;
        Integer i=0;
        Integer j=0;
        Integer start=-1;

        while (t<size){
            if (t%(m+m+n+n)==0){
                i=t/(m+m+n+n);
                j=t/(m+m+n+n);
                m-=1;
                n-=1;
                start+=1;
            }
            System.out.println("i:"+i+"j:"+j);
            res.add(matrix[i][j]);

            if (i==start && j<n ){
                j++;
            }else if (i<m && j==n ){
                i++;
            }else if (i>start && j==start ){
                i--;
            }else if (i==m && j>start ){
                j--;
            }
            t++;
        }



        return res;

    }

    public static void main (String[] args){
        SpiralMatrix54 solution = new SpiralMatrix54();
        int [][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> res = solution.spiralOrder(matrix);
        System.out.println(res);
    }

}
