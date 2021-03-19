package Topic.Array;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/12
 * \* Time: 11:42 上午
 * \* Description:
 * \
 */
public class FindMinimumInRotatedSortedArray {
    public int minArray(int[] numbers) {
        int n = numbers.length;
        if (n==0){
            return -1;
        }
        if (n==1){
            return numbers[0];
        }
        int left = 0;
        int right = n-1;

        while(left<right ){
            int middle = (left+right)/2;

            if (numbers[middle]>numbers[right]){
                left = middle+1;
            }else if(numbers[middle]<numbers[right]){
                right = middle;
            }else{
                right-=1;
            }
        }
        return numbers[left];




    }

}