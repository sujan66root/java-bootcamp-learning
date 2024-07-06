public class MissingNumber {
    public static int find(int[] arr){
        int sumArray = 0;
        int sumTotal = 5*(5 + 1)/2; //the sum of n natural numbers of 1 to n is n(n+1)/2
        for (int i : arr) {
            sumArray += i;
        }
        return sumTotal-sumArray;
    }
}
