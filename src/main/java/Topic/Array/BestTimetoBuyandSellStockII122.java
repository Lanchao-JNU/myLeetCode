package Topic.Array;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/3/19
 * \* Time: 5:20 下午
 * \* Description:
 * \
 */
public class BestTimetoBuyandSellStockII122 {
    public int maxProfit(int[] prices) {
        int maxProfit =0;
        for (int i=1;i<prices.length;i++){
            if (prices[i]>prices[i-1]){
                maxProfit+=prices[i]-prices[i-1];
            }
        }
        return maxProfit;

    }
}