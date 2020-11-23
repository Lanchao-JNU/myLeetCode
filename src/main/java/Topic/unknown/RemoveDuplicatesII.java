package Topic.unknown;

public class RemoveDuplicatesII {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len<=2) return len;
        int i = 0;
        int j = 0;


        while (i<len-2){
            if (!(nums[i]==nums[i+1]&&nums[i+1]==nums[i+2])){
                nums[j]=nums[i];
                j++;
            }

            i++;

        }
        nums[j]=nums[i];
        nums[j+1]=nums[i+1];

        return j+2;
    }

    public static void main(String[] args){
        RemoveDuplicatesII solution = new RemoveDuplicatesII();
        int [] nums = {1,1,1,2,2,3};
        int  res = solution.removeDuplicates(nums);
        System.out.println(res);
    }



}
