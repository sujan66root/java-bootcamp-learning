/*
BackTracking: Also known as brute force approach for
solving complex problems through the help of recursion.
The approach is such that to find the solution by trying out different options
and returning back to previous step if
there is a dead end.
* */
public class Main {
    public static void main(String[] args) {
//        Q1: Print all the permutations of any input number or strings and count them as well
        String str = "SUJ";
        Permutation perm = new Permutation();
        int count = perm.printPermutation(str, "", 0);
        System.out.println("The number of permutations available for string is:"+ count);
    }
}