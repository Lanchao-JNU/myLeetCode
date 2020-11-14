package Topic.unknown;

import java.util.Arrays;

public class SpiralMatrixII59 {
    public int[][] generateMatrix(int n) {

        int [][] res = new int [n][n];
        if (n==1){
            res[0][0]=1;
            return res;
        }
        Integer left=0;
        Integer right=0;
        Integer start = -1;
        Integer end = n;
        Integer t=0;
        for (int i=0;i<n*n;i++){
            if (i%(t+4*(end-start)) ==0) {
                start ++;
                end --;
                t=i;
                left =  start;
                right =  start;
                System.out.println("yes:"+t);
            }

            System.out.println("left: "+left+" right: "+right+" i :"+i+"+start: "+start+"+end: "+end);
            if (left==start && right <end){
                res[left][right]=i+1;
                right++;

            }else if(left<end && right==end){
                res[left][right]=i+1;
                left++;

            }else if (left==end && right>start){
                res[left][right]=i+1;
                right--;

            }else if (left>start & right ==start){
                res[left][right]=i+1;
                left--;

            }else{
                res[left][right]=i+1;
            }
        }
        return res;

    }

    public static void main(String[] args){
        SpiralMatrixII59 solution = new SpiralMatrixII59();
        int [][] res =solution.generateMatrix(9);
        for (int[] a : res){
            System.out.println(Arrays.toString(a));
        }

    }
}
