package Topic.unknown;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/15
 * \* Time: 10:31 上午
 * \* Description:
 * \
 */
public class SearchinRotatedSortedArray33 {
    public int search(int[] nums, int target) {
        int n = nums.length;

        if(n==0) return -1;
        if (n==1) {
            if (nums[0]==target){
                return 0;
            }else{
                return -1;
            }
        }

        int left = 0;
        int right = n-1;
        while (left<=right){
            int middle = (left+right)/2;
            if (nums[middle]==target) return middle;
            if (nums[left]<=nums[middle]){
                if (target>=nums[left] && target<nums[middle]) {
                    right = middle - 1;
                }else{
                    left = middle+1;

                }


            }else{
                if (target>nums[middle] && target<=nums[right]){
                    left = middle+1;
                }
                else{
                    right = middle-1;
                }

            }
        }
        return -1;



    }
}