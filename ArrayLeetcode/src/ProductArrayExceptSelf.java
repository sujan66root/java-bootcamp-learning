// Leetcode 238: Product of Array Except Self

//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]

public class ProductArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int leftProduct = 1;
        for(int i = 0; i < nums.length; i++){
            res[i] = leftProduct;
            leftProduct = nums[i] * leftProduct;
        };
        int rightProduct = 1;
        for (int i = nums.length-1; i >= 0 ; i--) {
            res[i] = res[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        };
        return res;
    }
}
