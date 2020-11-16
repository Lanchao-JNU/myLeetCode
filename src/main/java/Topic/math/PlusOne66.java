package Topic.math;

import java.util.ArrayList;
import java.util.List;

public class PlusOne66 {

    public int[] plusOne(int[] digits) {

        Integer len = digits.length;
        Integer borrow = 0;
        int [] res = new int [len];
        digits[len-1]++;
        while (len > 0) {

            if (digits[len-1] + borrow == 10) {
                res[len-1] = 0;
                borrow = 1;
            } else {
                res[len-1]=digits[len-1] + borrow;
                borrow = 0;
            }
            len--;
        }

        if (borrow == 1) {
            res = new int[digits.length+1];
            res[0] = 1;
        }



        return res;

    }

    public static void main(String[] args) {
        PlusOne66 solution = new PlusOne66();
        int[] digits = {1, 2, 3};
        int[] res = solution.plusOne(digits);
        for (int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }

}