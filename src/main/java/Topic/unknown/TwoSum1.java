package Topic.unknown;

import java.util.HashMap;
import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/2/24
 * \* Time: 5:35 下午
 * \* Description:
 * \
 */
public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i=0;i<=nums.length;i++){
            int flag = target-nums[i];
            if (map.containsKey(flag)){
                return new int [] {map.get(flag),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no solution");

    }
}