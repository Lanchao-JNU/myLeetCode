package util;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/4/6
 * \* Time: 7:33 下午
 * \* Description:
 * \
 */
public class Sort {
    private int [] numbers;
    private int length;

    public void QuickSort(int [] array){
        if (array==null || array.length==0){
            return;
        }
        this.numbers = array;
        this.length=array.length;
        QuickSort(0,length-1);

    }
//    private void QuickSort(int left,int right){
//        int i = left;
//        int j = right;
//        int middle = left+(right-left)/2;
//        int p = numbers[middle];//基准值
//        while (i<=j){
//            while (numbers[i]<p){
//                i++;
//            }
//            while (numbers[j]>p){
//                j--;
//            }
//            if (i<=j){
//                exchange(i,j);
//                i++;
//                j--;
//            }
//        }
//        if (left<j){
//            QuickSort(left,j);
//        }
//        if (right>i){
//            QuickSort(i,right);
//        }
//
//    }


    private void QuickSort(int left,int right){
        int i = left;
        int j = right;
        int middle = left+(right-left)/2;
        int p = numbers[middle];
        while (i<=j){
            while (numbers[i]<p) i++;
            while (numbers[j]>p) j--;
            if (i<=j) {
                exchange(i,j);
                i++;
                j--;

            }
        }
        if (j>left) QuickSort(left,j);
        if (i<right) QuickSort(i,right);
    }

    private void exchange(int i,int j){
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}