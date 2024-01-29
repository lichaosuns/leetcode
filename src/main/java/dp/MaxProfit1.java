package dp;

/**
 * <a href="https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/description/">...</a>
 */
public class MaxProfit1 {
    public int maxProfit(int[] prices) {
        int result = 0;
        int min = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min) {
                min = price;
            } else {
                result = Math.max(price - min, result);
            }
        }
        return result;
    }
}
