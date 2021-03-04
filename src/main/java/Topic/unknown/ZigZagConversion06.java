package Topic.unknown;

import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/2/25
 * \* Time: 6:58 下午2
 * \* Description:
 * \
 */
public class ZigZagConversion06 {
    public String convert(String s, int numRows) {
        if (numRows<2){
            return s;
        }
        String [] result = new String [numRows];

        int i=0;
        int flag=-1;
        for (int j=0;j<s.length();j++){
            result[i]+=s.charAt(j);
            if (i==0 || i==numRows-1){
                flag=-flag;
            }
            i+=flag;
        }
        System.out.println(result);
        String res="";
        for (String str:result){
            if (str!=null) {
                res += str.replaceAll("null","");
                System.out.println(str);
            }

        }
        return res.toString();

    }

    public static void main(String[] args){
        ZigZagConversion06 solution = new ZigZagConversion06();
        String s="PAYPALISHIRING";
        System.out.println(solution.convert(s,3));

    }
}