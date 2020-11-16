package Topic.math;

public class AddBinary67 {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder("");
        Integer lenA = a.length()-1;
        Integer lenB = b.length()-1;
        Integer left,right;
        Integer borrow = 0;
        while (lenA>0 || lenB>0 || borrow>0){
            if (lenA<0){
                left=0;
                right=(int)b.charAt(lenB);
            }else if (lenB<0){
                left=(int)a.charAt(lenA);
                right=0;
            }else {
                left=(int)a.charAt(lenA);
                right=(int)b.charAt(lenB);
            }

            if (left+right+borrow>=2){
                res.insert(0,0);
                borrow+=left+right-1;
            }else{
                res.insert(0,left+right+borrow);
                borrow=0;
            }


        }
        return res.toString();

    }

    public static void main(String[] args){
        AddBinary67 solution = new AddBinary67();
        String a = "11";
        String b = "10";
        String res = solution.addBinary(a,b);
        System.out.println(res);
    }

}
