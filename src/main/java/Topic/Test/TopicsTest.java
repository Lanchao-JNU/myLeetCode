package Topic.Test;

import util.ListNode;

import java.util.ArrayList;
import java.util.Arrays;

public class TopicsTest {
    public static void main(String[] args) {


    String s="123";
    System.out.println(compareCoordinate(11,22,6));
    }

    public static int fib(int n) {
        int a=0;
        int b=1;

        for (int i=0;i<n;i++){
            int tmp=a;
            a=b;
            b+=tmp;

        }
        return b;

    }

    public static  boolean compareCoordinate(int i,int j,int k){
        int sumOver = 0;
        while (i!=0){
            sumOver+=i%10;
            i=i/10;
        }
        while (j!=0){
            sumOver+=j%10;
            j=j/10;
        }
        System.out.println(sumOver);
        if (sumOver<=k) return true;
        return false;

    }

}
