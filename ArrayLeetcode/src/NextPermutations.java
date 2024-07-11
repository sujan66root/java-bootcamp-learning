import java.util.Arrays;

//leetcode 31.
//The next permutation of an array of integers is the next lexicographically greater permutation of its integer.
public class NextPermutations {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        System.out.println(Arrays.toString(printNextPermutations(nums)));
    }

    public static int[] printNextPermutations(int[] nums) {
        int i = nums.length - 2;
//   1.     find point of change
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if(i == -1){
            reverse(nums, 0, nums.length-1);
        }
//        got 0
//        2. find highest possible number from end comparing to the point of change number and swap
        int j = nums.length - 1;
        if (i >= 0) {
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1);
        return nums;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
