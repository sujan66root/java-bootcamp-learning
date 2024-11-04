// Leetcode 1679. Max Number of K-Sum Pairs
import java.util.Arrays;

public class MaxKSumPairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        while(left < right){
            if(nums[left] + nums[right] == k){
                // found a pair that equals so increase the count
                count++;
                left++;
                right--;
            }else if(nums[left] + nums[right] > k){
                // target is greater so decrease from right
                right--;
            }else{
                // Increase sum by moving the left pointer
                left++;
            }
        }
        return count;
    }
}
