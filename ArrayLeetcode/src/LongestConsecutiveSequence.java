import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//leetcode 128
//Input: nums = [100,4,200,1,3,2]
//Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        longestConsecutiveUsingSorting(nums);
        longestConsecutiveUsingHashSet(nums);
    }

    public static int longestConsecutiveUsingHashSet(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
//        step1: add elements in hashset
        for (int num : nums) numSet.add(num); // we have {100, 4, 200, 1, 3, 2}
        int longestStreak = 1;
        for (int num: nums) {
            if(!numSet.contains(num-1)){ // 100 - 1 == 99 contains or not check
//                99 doesnt contain, so first streak is 1 as 100 is the start of longest
                int currentStreak = 1;
                int currentNum = num;
                // Count upwards to find the length of the sequence
                while(numSet.contains(currentNum + 1)){ // check if 101 exists, if exists increase the streak
                    currentStreak++;
                    currentNum++;
                }
                // Update the longest streak found
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }

    public static int longestConsecutiveUsingSorting(int[] nums) {
//        if array length = 0, return 0;
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);// 1. sort the array
//        1,2,3,4,100,200
        int longestStreak = 1;
        int currentStreak = 1;
        for (int i = 1; i < nums.length; i++) {
//            skipping duplicate numbers, as the streak will be 1
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1) {
//                    2 == 1+1
                    currentStreak++;
                    longestStreak++;
                }
//                until here, we have current streak as 4, and longest streak as 4
//                100; nums[4]
                else {
//                    update longest streak checking with current streak;
                    longestStreak = Math.max(currentStreak, longestStreak);
                    currentStreak = 1;
                }
            }
        }
        // Step 4: Final check in case the longest streak ends at the last number
        return Math.max(currentStreak, longestStreak);
    }
}
