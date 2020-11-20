package Topic.unknown;

import java.util.Arrays;

public class SortColors75 {
    public void sortColors(int[] nums) {
        //方法一：内置排序
//        Arrays.sort(nums);
        Integer p0 = 0;
        Integer p1 = 0;

        //方法二：双指针
        for(int i=0;i<nums.length;++i){
            if (nums[i]==1 ){
                nums[i] = nums[p1];
                nums[p1] = 1;
                ++p1;
            }else if (nums[i]==0){
                nums[i] = nums[p0];
                nums[p0] = 0;
                if (p0<p1){
                    int temp = nums[i];
                    nums[i] = nums[p1];
                    nums[p1] = temp;
                }
                ++p0;
                ++p1;
            }

        }




    }

}
