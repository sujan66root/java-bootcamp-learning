import java.util.Arrays;

//Leetcode 169
//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times.
//You may assume that the majority element always exists in the array.
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,3,3,2,2,3,2};
        Arrays.sort(nums);
        int n = nums.length;
        System.out.println(nums[n/2]);
    }
}
