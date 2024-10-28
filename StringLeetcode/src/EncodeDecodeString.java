// Leetcode 271 premium question
//Input: ["hello", "world"]
//Encoded String: "5#hello5#world"
//Decoded List: ["hello", "world"]


import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeString {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String word: strs){
            sb.append(word.length());
            sb.append("#");
            sb.append(word);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> words = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            // Find the position of '#'
            while (str.charAt(j) != '#') j++;

            // Length of the next word
            int length = Integer.parseInt(str.substring(i, j));

            // Move i to the start of the actual word
            i = j + 1;

            // Extract the word of the specified length
            String word = str.substring(i, i + length);
            words.add(word);

            // Move i to the next encoded part
            i += length;
        }

        return words;
    }

}
