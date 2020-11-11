package Topic.Hash;

import java.util.*;

public class GroupAnagrams49 {
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs.length==0) return new ArrayList<List<String>>();

        Map<String,List> ans = new HashMap<String, List>();
        for (String str :strs){
            char [] ca = str.toCharArray();
            Arrays.sort(ca);
            String key  =String.valueOf(ca);
            if(!ans.containsKey(key)){
                ans.put(key,new ArrayList());
            }
            ans.get(key).add(str);
        }
        return new ArrayList(ans.values());
    }

    public static void main (String[] args){
        GroupAnagrams49 solution = new GroupAnagrams49();
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res = solution.groupAnagrams(strs);
        System.out.println(res);
    }
}

