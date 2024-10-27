// Leetcode 392: Is subsequence

//Input: s = "abc", t = "ahbgdc"
//Output: true

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        // Traverse `t` with `j` and `s` with `i`
        while (i < s.length() && j < t.length()) {
            // If characters match, move the pointer in `s`
            if (s.charAt(i) == t.charAt(j)) {
                i++; // Move the pointer in `s`
            }
            j++; // Always move the pointer in `t`
        }

        // If `i` has reached the end of `s`, then `s` is a subsequence of `t`
        return i == s.length();
    }
}
