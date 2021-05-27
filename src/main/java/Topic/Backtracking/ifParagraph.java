package Topic.Backtracking;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/5/19
 * \* Time: 下午1:43
 * \* Description:
 * \
 */
public class ifParagraph {
    public static void main(String [] args){

    }

    public boolean ifParagraph(String str){
        if (ifWord(str)==true) return true;
        if (str.length()==0) return false;

        for (int i=0;i<str.length();i++){
            if (ifWord(str.substring(0,i))==true){
                if(ifParagraph(str.substring(i+1,str.length()-1))==true) return true;
            }
        }

        return false;
    }

    public boolean ifWord(String str){
        return false;

    }

}