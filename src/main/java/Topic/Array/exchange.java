package Topic.Array;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/18
 * \* Time: 11:34 上午
 * \* Description:
 * \
 */
public class exchange {
    public int[] exchange(int[] nums) {
        int length = nums.length;
        if (length<=1) return nums;

        int left = 0;
        int right = length-1;
        while (left<right){
            while(left<right &&nums[left]%2==1){
                left+=1;
            }
            while (left<right && nums[right]%2==0){
                right-=1;
            }
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;

        }
        return nums;

    }
}