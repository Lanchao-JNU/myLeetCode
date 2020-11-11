package Topic.unknown;

public class JumpGame55 {
    public boolean canJump(int[] nums) {
//        Integer len =  nums.length;
//
//
//        if (len==1){
//            return true;
//        }
//        Integer end = len-1;
//        while (end>0) {
//            Integer step = nums[end-1];
//            if(step>=len-end){
//                if(end==1) return true;
//                len = end;
//            }
//            end--;
//
//        }
//        return false;

        Integer k = 0;
        for (int i=0;k<nums.length-1;i++){
            if(i>k) return false;
            k= Math.max(k,i+nums[i]);

        }
        return true;
    }

    public static void main(String[] args){
        JumpGame55 solution = new JumpGame55();
        int[] nums = {2,3,1,1,4};
        boolean res = solution.canJump(nums);
        System.out.println(res);
    }

}
