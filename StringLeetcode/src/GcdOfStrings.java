// leetcode 1071 GCD of Strings
public class GcdOfStrings {
    public String gcdOfStrings(String str1, String str2){

        // Check if str1 + str2 is equal to str2 + str1
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find the GCD of lengths of str1 and str2
        int gcdLength = gcd(str1.length(), str2.length());

        // Return the substring from 0 to gcdLength of str1 as the GCD string
        return str1.substring(0, gcdLength);
    }

    // Helper function to compute the GCD of two numbers
    public int gcd(int a, int b){
        if(b==0){
            return a;
        }else{
            return gcd(b, a%b);
        }
    }
}
