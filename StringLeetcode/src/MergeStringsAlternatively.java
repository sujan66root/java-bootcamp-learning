// Leetocde 1768 Merge Strings Alternatively
// Input: word1 = "abc", word2 = "pqr"
//Output: "apbqcr"
public class MergeStringsAlternatively {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int maxlength = Math.max(word2.length(), word1.length());
        for (int i = 0; i < maxlength; i++) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }
}
