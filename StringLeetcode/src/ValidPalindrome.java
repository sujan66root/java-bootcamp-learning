// Leetcode 125
// Remove all non alphanumeric characters from string and check for pallindrome.
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
// Leetcode Reverse String
public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        StringBuilder name = new StringBuilder("Sujan");
        System.out.println(checkPalindromeWord(s));
        System.out.println(reverseString(name));
    }
    public static boolean checkPalindromeWord(String s){
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!= s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static StringBuilder reverseString(StringBuilder name){
        int left = 0;
        int right = name.length()-1;
        while(left<right){
            char leftChar = name.charAt(left);
            char rightChar = name.charAt(right);
            name.setCharAt(left, rightChar);
            name.setCharAt(right, leftChar);
            left++;
            right--;
        }
        return name;
    }
}
