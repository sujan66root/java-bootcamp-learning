import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number you want to find results for: ");
        int n = sc.nextInt();
        Factorial fact = new Factorial();
        Fibonacci fibo = new Fibonacci();
        Power pow = new Power();

//        Q1: Fibonacci Number
        System.out.println("Sum of first "+n+" Fibonacci Numbers:"+fibo.calc(n));
//        Q2: Factorial Number
        System.out.println("Factorial of "+n+ " is: "+ fact.calc(n));
//        Q3: Power of a Number
        System.out.println("Power of " +n+ " is: "+pow.calc(n,n));
    }
}