package Topic.math;

public class Pow50 {
    public double myPow(double x, int n) {

        if (n==0){
            return 1;
        }

        double res = myPow(x,n/2);
        if(n>0) {
            if (n % 2 == 1) {
                return res * res * x;
            } else {
                return res * res;
            }
        }else{
            n=-n;
            if (n % 2 == 1) {
                return res * res * 1/x;
            } else {
                return res * res;
            }
        }

    }


    public static void main (String[] args){
        Pow50 solution = new Pow50();
        double x = 2.0;
        int n = -3;
        double res = solution.myPow(x,n);
        System.out.println(res);
    }
}
