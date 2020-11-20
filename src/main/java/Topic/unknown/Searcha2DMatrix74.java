package Topic.unknown;

public class Searcha2DMatrix74 {

    public boolean searchMatrix(int[][] matrix, int target) {
        Integer m = matrix.length;
        if (m == 0) {
            return false;
        }
        Integer n = matrix[0].length;
        if (n == 0) {
            return false;
        }

        if (m==1 && n==1) return matrix[0][0]==target;

        if (matrix[0][0]>target) return false;
        if (matrix[m-1][n-1]<target ) return false;
        Integer top = 0;
        Integer bottom = m ;
        Integer mid = 0;
        Integer col = 0;
        while (top < bottom && m!=1) {
            mid = (top + bottom) / 2;
            if (matrix[mid][0] == target) return true;
            if (matrix[mid][0] < target) {
                col = mid;
                top = mid + 1;
            } else {
                bottom = mid - 1;
            }

        }
        Integer left = 0;
        Integer right = n ;
        mid = 0;
        while (left < right && n!=1) {
            mid = (left + right) / 2;
            System.out.println("col+"+col+"mid"+mid);
            System.out.println("matrix:"+matrix[col][mid]);

            if (matrix[col][mid] == target) return true;

            if (matrix[col][mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;


    }

    public static void main(String[] args){
        Searcha2DMatrix74 solution = new Searcha2DMatrix74();
        int[][] matrix = {{1,1},{3,3}};
        boolean res = solution.searchMatrix(matrix,2);
        System.out.println(res);
    }
}
