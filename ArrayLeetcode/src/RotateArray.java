//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
// Leetcode 189

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
//        output = [5,6,7,1,2,3,4]
        rotate(nums, k);
    }
    public static void rotate(int[] nums, int k){
        k %= nums.length; // Normalize k
        System.out.println(k);
//        rotate whole array
        reverse(nums, 0, nums.length-1);
//        output [7,6,5,4,3,2,1]
//        now rotate array from 1 to K
        reverse(nums, 0, k - 1);
//        output [5,6,7,4,3,2,1]
        reverse(nums, k, nums.length-1);
        System.out.println(Arrays.toString(nums));

    }
    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
