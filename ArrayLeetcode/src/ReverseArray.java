import java.util.Arrays;
import static java.util.Collections.swap;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,8,9};
        reverse(arr1);
        System.out.println("The reverse of the array is: " + Arrays.toString(arr1));
    }
    public static void reverse(int[] arr1){
        int start = 0;
        int end = arr1.length-1;
        while(start < end){
            swap(arr1, start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
