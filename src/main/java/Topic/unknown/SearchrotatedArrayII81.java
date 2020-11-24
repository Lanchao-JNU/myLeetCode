package Topic.unknown;

public class SearchrotatedArrayII81 {

    public boolean search(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        while (left<=right ){
            mid = (left+right)/2;
            if (nums[mid]==target ) return true;
            if (nums[left]==nums[mid] ) {left++;continue;}
            if (nums[left] <nums[mid]){
                if (nums[left]<=target && nums[mid]>target){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
            else{
                if (nums[mid]<target && nums[right]>=target){
                    left = mid+1;
                }else{
                    right = mid-1;

                }
            }
        }
        return false;


    }

    public static void main(String [] args){
        SearchrotatedArrayII81 solution = new SearchrotatedArrayII81();
        int [] nums = {1,1,3,1};
        int target = 3;
        boolean res = solution.search(nums,target);
        System.out.println(res);
    }


}
