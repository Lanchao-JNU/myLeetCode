package Topic.Hash;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/4/21
 * \* Time: 7:46 下午
 * \* Description:
 * \
 */
public class firstSingleChar {

    private static Character findChar(String s){
        if (s.length() ==0) return null;
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (map.containsKey(c)){
                map.put(c,-1);
            }else{
                map.put(c,1);
            }

        }

        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if (map.get(c)==1){
                return c;
            }
        }

        return null;



    }
    public static void main (String[] args){
        String str="sscasdkja";
        System.out.println(findChar(str));
    }


}