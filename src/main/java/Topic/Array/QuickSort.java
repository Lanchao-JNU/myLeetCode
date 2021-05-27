package Topic.Array;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/5/25
 * \* Time: 下午3:57
 * \* Description:
 * \
 */
//public class QuickSort {
//    public static void quickSort(int[] arr,int low,int high){
//        int i,j,temp,t;
//        if(low>high){
//            return;
//        }
//        i=low;
//        j=high;
//        //temp就是基准位
//        temp = arr[low];
//
//        while (i<j) {
//            //先看右边，依次往左递减
//            while (temp<=arr[j]&&i<j) {
//                j--;
//            }
//            //再看左边，依次往右递增
//            while (temp>=arr[i]&&i<j) {
//                i++;
//            }
//            //如果满足条件则交换
//            if (i<j) {
//                t = arr[j];
//                arr[j] = arr[i];
//                arr[i] = t;
//            }
//
//        }
//        //最后将基准为与i和j相等位置的数字交换
//        arr[low] = arr[i];
//        arr[i] = temp;
//        //递归调用左半数组
//        quickSort(arr, low, j-1);
//        //递归调用右半数组
//        quickSort(arr, j+1, high);
//    }
//
//
//    public static void main(String[] args){
//        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
//        quickSort(arr, 0, arr.length-1);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//}




public class QuickSort {

    public static void main(String[] args){
        int [] arr ={3,45,78,64,52,11,64,55,99,11,18};
        QuickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length-1;i++) System.out.println(arr[i]);


    }

    public static void QuickSort(int[] arr, int left, int right){
        if (left>right) return ;
        int p = arr[left];
        int low = left;
        int high = right;

        while (low<high){
            while (low<high && arr[high]>=p) high--;
            while (low<high && arr[low]<=p)low++;

            if (low<high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

            }
        }
        arr[left] = arr[low];
        arr[low] = p;
        QuickSort(arr,low+1,right);
        QuickSort(arr,left,low-1);
    }
}