package Topic.math;

public class Sqrtx {
    // 牛顿法
    public int mySqrt(int x) {
        if (x==0) return 0;
        double start = x;
        while (true){
            double end = (start+x/start)*0.5;
            System.out.println(end-start);
            if (Math.abs(end-start)<1e-7) break;
            start=end;
        }
        return (int)start;

    }
    //二分法
    public int mySqrt2(int x) {
        if (x==0) return 0;
        if (x==1) return 1;
        int left =0;
        int right =x;
        int ans=-1;
        while (left<=right){
            int mid = (left+right)/2;
            if ((long)mid*mid<=x){
                ans = mid;
                left = mid+1;
            }else{
                right=mid-1;
            }

        }

        return ans;

    }



    public static void main(String [] args){
        Sqrtx solution = new Sqrtx();
        int x=6;
        int res = solution.mySqrt2(x);
        System.out.println(res);


    }

}
