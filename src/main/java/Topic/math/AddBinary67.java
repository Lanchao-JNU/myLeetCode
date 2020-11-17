package Topic.math;

public class AddBinary67 {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder("");
        Integer lenA = a.length()-1;
        Integer lenB = b.length()-1;
        Integer left,right;
        Integer borrow = 0;
        while (lenA>=0 || lenB>=0 || borrow>0){
            if (lenA<0){
                left=0;
            }else{
                left=(int)a.charAt(lenA)-'0';
            }
            if (lenB<0){
                right=0;
            }else{
                right=(int)b.charAt(lenB)-'0';
            }

            if (left+right+borrow>=2){
                res.insert(0,(char)(left+right+borrow-2+'0'));

                borrow=1;
            }else{
                res.insert(0,(char)(left+right+borrow+'0'));
                borrow=0;
            }
            lenA--;lenB--;




        }
        return res.toString();

    }

    public static void main(String[] args){
        AddBinary67 solution = new AddBinary67();
        String a = "1111";
        String b = "1111";
        String res = solution.addBinary(a,b);
        System.out.println(res);

    }

}
