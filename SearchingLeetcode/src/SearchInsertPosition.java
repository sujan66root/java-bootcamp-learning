// Leetcode 35 - Search Insert Position
// Input: nums = [1,3,5,6], target = 5
// Output: 2
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0; // The left pointer starts at the beginning of the array
        int right = nums.length - 1; // The right pointer starts at the end of the array

        while(left <= right) { // While the search range is valid
            // Calculate mid index to avoid overflow issues (left + (right - left) / 2)
            int mid = left + (right - left) / 2;

            if(target == nums[mid]) {
                return mid;
            } else if(target > nums[mid]) { // If target is greater, search in the right half
                left = mid + 1; // Move the left pointer to mid + 1
            } else { // If target is smaller, search in the left half
                right = mid - 1; // Move the right pointer to mid - 1
            }
        }

        // If the target is not found, left will point to the position where it should be inserted
        return left; // This is the correct index where the target can be inserted
    }
}
