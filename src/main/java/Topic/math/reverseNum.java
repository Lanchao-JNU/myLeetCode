package Topic.math;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/5/17
 * \* Time: 下午4:21
 * \* Description:
 * \
 */
public class reverseNum {

    public static void main(String[] args){
        System.out.println(reverseInt(intToString(123),0));
    }




    public static StringBuilder reverseInt(StringBuilder str,int index){
        StringBuilder sb = new StringBuilder();
        if (index==str.length()-1) return str;
        sb = reverseInt(str,index+1);
        char first = sb.charAt(index);
        sb.deleteCharAt(index);
        sb.append(first);
        return sb;

    }

    public static StringBuilder intToString(int num){
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(num));
        return sb;
    }
}
