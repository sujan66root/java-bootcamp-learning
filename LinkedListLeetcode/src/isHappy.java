//Leetcode 202. Happy Number
public class isHappy {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(findIsHappy(n));
    }

    public static boolean findIsHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = findSquareSum(slow);
            fast = findSquareSum(findSquareSum(fast));
        }while(slow != fast);
        return slow == 1;
    }

    public static int findSquareSum(int n) {
        int totalSum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            totalSum += lastDigit * lastDigit;
            n /= 10;
        }
        return totalSum;
    }
}
