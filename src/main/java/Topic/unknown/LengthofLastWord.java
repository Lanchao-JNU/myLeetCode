package Topic.unknown;

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        Integer len = s.length();
        if (len==0){
            return 0;
        }
        int i=len-1;
        if (s.charAt(len-1)==' '){
            while (i>=0){
                if (s.charAt(i)==' '){
                    i--;len--; continue;
                } break;
            }
        }
        System.out.println(len);
        while (i>=0){
                if (s.charAt(i)==' ') return len-i-1;
                i--;
            }

        return len;


    }

    public static void main (String [] args){
        LengthofLastWord solution = new LengthofLastWord();
        String s = "  ";
        int res = solution.lengthOfLastWord(s);
        System.out.println(res);
    }

}
