package Topic.Hash;

import java.util.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/19
 * \* Time: 6:46 下午
 * \* Description:
 * \
 */
public class WordCount {
    public static Set<String> WordCount(String[] strs) {

        Set<String> result = new HashSet();
        HashMap<String,Integer> map = new HashMap();


        for (String str:strs) {
            if (map.containsKey(str)) {
                Integer value = map.get(str);
                if (value == 2) {
                    result.add(str);
                } else {
                    map.put(str, value += 1);
                }
            }else{
                map.put(str,1);
            }
        }
        return result;

    }

    public static void main (String[] args){
        String [] strs = {"eat","tea","eat","ate","nat","bat","eat"};
        Set<String> res = WordCount(strs);
        System.out.println(res);
    }

}