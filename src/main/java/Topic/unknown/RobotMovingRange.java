package Topic.unknown;

import java.util.LinkedList;
import java.util.Queue;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/15
 * \* Time: 1:32 下午
 * \* Description:
 * \
 */
public class RobotMovingRange {

    public int movingCount(int m, int n, int k) {
        if (k==0) return 1;
        Queue<int []> queue = new LinkedList();
        queue.offer(new int[]{0, 0});
        int [] dx = {0,1};
        int [] dy = {1,0};
        boolean [][] ifVisit = new boolean[m][n];
        ifVisit[0][0]=true;
        int result = 1;
        while (!queue.isEmpty()){
            int [] cell = queue.poll();
            int x = cell[0];
            int y = cell[1];
            for (int i=0;i<2;i++){
                int tx = x+dx[i];
                int ty = y+dy[i];
                if(tx>=m || ty>=n || ifVisit[tx][ty]==true ||!compareCoordinate(tx,ty,k)){
                    continue;
                }
                result+=1;
                queue.offer(new int [] {tx,ty});
                ifVisit[tx][ty]=true;
            }

        }
        return result;






    }

    public boolean compareCoordinate(int i,int j,int k){
        int sumOver = 0;
        while (i!=0){
            sumOver+=i%10;
            i=i/10;
        }
        while (j!=0){
            sumOver+=j%10;
            j=j/10;
        }
        if (sumOver<=k) return true;
        return false;

    }
}