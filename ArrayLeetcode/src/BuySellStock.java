// Leetcode #121 Best time to buy and sell stock
public class BuySellStock {
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(bestTimeToBuySellStock(nums));
    }
    public static int bestTimeToBuySellStock(int[] nums){
        int minPrice = nums[0];
        int maxProfit = 0;
        for (int i = 1; i < nums.length; i++) {
//            i = 2,
            int cost = nums[i] - minPrice;
//            1-7 = -6, 5-1 = 4,
            maxProfit = Math.max(cost,maxProfit);
//            -6,0 = 0, (4,0) = 4,
            minPrice = Math.min(minPrice, nums[i]);
//           7,1 = 1, (1,5) = 1
        }
//
        return maxProfit;
    }
}
