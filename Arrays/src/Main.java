import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Learning Arrays");
//        Q1 Missing Number
        int[] arr = {1, 2, 3, 5};
        System.out.println("Q1: The Missing Number in the array is: " + MissingNumber.find(arr));
//        Q2 Two Sum / Pairs
        int[] inputNums = {2, 7, 11, 15};
        int targetOutput = 13;
        int[] finalResult = (TwoSum.find(inputNums, targetOutput));
        if (finalResult.length > 0) {
            System.out.println("Q2: The positions where the elements have sum equal to the target is: " + Arrays.toString(finalResult));
        } else {
            System.out.println("No elements in the array matched with target");
        }
//        Q3: Search for Value in Array
        int[] values = {1,4,5,8,9};
        int searchFor = 8;
        int[] found = searchValue.linearSearch(values, searchFor);
        if(found.length > 0){
            System.out.println("Q3: The value is found in array of index "+found[1]+" and value is:" +found[0]);
        }else{
            System.out.println("The value is not found in the array");
        }
    }
}