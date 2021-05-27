package Topic.unknown;

import java.util.Arrays;

public class MergeSortedArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int [] nums = Arrays.copyOf(nums1,nums1.length);

        int i=0;
        int j=0;
        int t=0;

        while (i!=m&&j!=n){
            if (nums[i]<=nums2[j]){
                nums1[t]=nums[i];
                i++;
            }else{
                nums1[t]=nums2[j];
                j++;
            }
            t++;
        }

        while (i!=m){
            nums1[t]=nums[i];
            i++;
            t++;
        }
        while (j!=n){
            nums1[t]=nums2[j];
            j++;
            t++;
        }

        System.out.println(Arrays.toString(nums1));

    }


    public static void main(String[] args){
        MergeSortedArray88 solution = new MergeSortedArray88();
        solution.merge(new int [] {1},1,new int []{},0);

    }


}
