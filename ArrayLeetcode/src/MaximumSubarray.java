import java.util.Arrays;
//Given an integer array nums, find the subarray with the largest sum, and return its sum.

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, -1, -3, -4, -1, -2, -1, -5, -4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            // Update maxSum if currentSum is greater than maxSum
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            // If currentSum becomes negative, reset it to 0
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
