package Topic.unknown;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeros73 {
    public void setZeroes(int[][] matrix) {
        Integer m = matrix.length;
        Integer n = matrix[0].length;
        List<int []> zeros= new ArrayList<int []>();


        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (matrix[i][j]==0) zeros.add(new int[]{i, j});
            }
        }



        for (int [] zero:zeros){
            for (int item:zero) System.out.println(item);
            for (int i=0;i<m;i++) matrix[i][zero[1]]=0;
            for (int j=0;j<n;j++) matrix[zero[0]][j]=0;
        }
    }

    public static void main(String [] args){
        SetMatrixZeros73 solution = new SetMatrixZeros73();
        int [][] matrix = {{0,1}};
        solution.setZeroes(matrix);
        for (int[] row:matrix){
            for (int col:row){
                System.out.println(col);
            }
        }
    }

}
