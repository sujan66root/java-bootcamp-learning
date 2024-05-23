public class Main {
    /**
     * Quick theory of Recursion
     * Recursion is a condition where the function calls itself with the corresponding function being the recursive function.
     * <p>
     * Base condition:
     * the condition need for the recursive function to stop calling itself otherwise there will be infinite calling of function
     * <p>
     * Use of Recursion:
     * to solve bigger problems in simpler way
     * to convert recursive solution to iteration and vice versa
     * space complexity:
     */
    public static void main(String[] args) {
//        Q1: Fibonacci Number
        int num = 5;
        System.out.println("Sum of Fibonacci Numbers:"+fibo(7));
//        Q2: Factorial Number
        System.out.println("Factorial of "+num+ " is: "+ factorial(num));
    }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    static int factorial(int num) {
        if (num < 2) {
            return num;
        } else {
            return num * factorial(num -1);
        }
    }
}