//Leetcode 283 blind 75
import java.util.Arrays;

// Move Zeroes to the end
//input : [0,1,0, 4,5, 12]
//output: [1,4,5,12,0,0]
public class MoveZeroesToEnd {
    public static int[] moveZeroes(int[] nums){
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if(nums[right] != 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,4,5,12};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
}
