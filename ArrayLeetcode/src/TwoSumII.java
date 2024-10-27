//Leetcode 167 Two Sum II is sorted
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length -1;
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                return new int[]{left + 1, right +1};
            }else if(sum> target){
                right --;
            }else{
                left++;
            }
        }
        return new int[]{-1, -1};
    }
}
//Time complexity: O(N)
//Space Complexity: O(1)