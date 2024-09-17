import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

// Leetcode 496: Next Greater Element 1
public class NextGreaterElement {
    public static void main(String[] args) {
//        nums1 = [4,1,2], nums2 = [1,3,4,2]
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        for (int n: nextGreaterElement(nums1, nums2)) {
            System.out.println(n);
        }
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        // Step 1: Create a HashMap to store the next greater element for each number in nums2
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            // If the current number is greater than the number on top of the stack,
            // it means we have found the next greater element for the number on the stack.
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }
        // If there are any remaining elements in the stack, it means they do not have
        // a next greater element, so we map them to -1.
        while (!stack.isEmpty()){
            map.put(stack.pop(), -1);
        }
//        so now we have hashmap as, 1:3,3:4,4:-1,2:-1 where nums2 and their next greater element
        int[] nextGreaterElement = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            nextGreaterElement[i] = map.get(nums1[i]);
        }
        return nextGreaterElement;
    }
}
