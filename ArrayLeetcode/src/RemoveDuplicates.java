import java.util.Arrays;
import java.util.HashSet;

//remove duplicates from sorted array
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicateFromSortedArray(nums));
        System.out.println(removeDuplicatesUsingTwoPointers(nums));
    }
    public static int removeDuplicateFromSortedArray(int[] nums){
        HashSet<Integer> newNumbers = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            newNumbers.add(nums[i]);
        }
        int k = newNumbers.size();
        int index = 0;
        for(int j:newNumbers){
            nums[index++] = j;
        }
        return k;
    }
    public static int removeDuplicatesUsingTwoPointers(int[] nums){
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
