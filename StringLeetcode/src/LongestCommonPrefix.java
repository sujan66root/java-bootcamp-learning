import java.util.Arrays;

//Leetcode 14
//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("First Approach: " + findLongestCommonPrefix(strs));

        String[] strs2 = {"flower", "flow", "flight"};
        String result = strs2[0];
        for (int j = 1; j < strs2.length; j++) {
            result = findCommonPrefix(result, strs2[j]);
        }
        System.out.println("Second Approach: " + result);
    }

    // First Approach
    public static String findLongestCommonPrefix(String[] s) {
        if (s == null || s.length == 0) return "";
        Arrays.sort(s);
        StringBuilder sb = new StringBuilder();
        char[] first = s[0].toCharArray();
        char[] last = s[s.length - 1].toCharArray();
        int minLength = Math.min(first.length, last.length);
        for (int i = 0; i < minLength; i++) {
            if (first[i] != last[i]) {
                break;
            }
            sb.append(first[i]);
        }
        return sb.toString();
    }

    // Second Approach
    public static String findCommonPrefix(String first, String next) {
        int n = Math.min(first.length(), next.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (first.charAt(i) == next.charAt(i)) {
                sb.append(first.charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();
    }
}
