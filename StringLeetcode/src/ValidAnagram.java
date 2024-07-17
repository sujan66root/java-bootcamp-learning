import java.util.Arrays;

// Leetcode 242
//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(checkAnagram(s,t));
    }
    public static boolean checkAnagram(String s, String t){
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        if(sArray.length != tArray.length){
            return false;
        }
        return Arrays.equals(sArray, tArray);
    }
}
