import java.util.Arrays;
import java.util.HashSet;

//Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        System.out.println(duplicate(nums));
        System.out.println(checkDuplicateUsingHashset(nums));
    }
// Sorting Approach to Solve
    public static boolean duplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
    // Hash Set Approach to solve the question
//A HashSet is a collection of items where every item is unique
    public static boolean checkDuplicateUsingHashset(int[] nums){
        HashSet<Integer> duplicate = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(duplicate.contains(nums[i])){
                return true;
            }
            duplicate.add(nums[i]);
        }
        return false;
    }
}


