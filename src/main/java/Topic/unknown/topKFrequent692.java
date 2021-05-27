package Topic.unknown;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/5/20
 * \* Time: 上午11:04
 * \* Description:
 * \
 */
public class topKFrequent692 {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String,Integer> map = new HashMap();
        //HashMap实现 word-count
        for (String word:words){
            if (map.containsKey(word)){
                int num = map.get(word);
                map.put(word,num+1);
            }else{
                map.put(word,1);
            }
        }

        //构建最小堆
        PriorityQueue<String> queue = new PriorityQueue<>((o1, o2)->{
            Integer countO1 = map.get(o1);
            Integer countO2 = map.get(o2);
            if(countO1.equals(countO2)){
                return o2.compareTo(o1);
            }else{
                return countO1-countO2;
            }
        }

        );
        for (String key:map.keySet()){
            queue.offer(key);
            if(queue.size()>k){
                queue.poll();
            }
        }
        //用栈输出（倒序)
        LinkedList<String> result = new LinkedList();
        while (!queue.isEmpty()){
            result.push(queue.poll());
        }
        return result;


    }
}