//Leetcode 151
// Reverse Words in a String

import java.util.Arrays;

//Input: s = "the sky is blue"
//Output: "blue is sky the"
public class ReverseWord {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s){
        String[] splitWords = s.trim().split("\\s+");
        String[] reversedArrayWord = new String[splitWords.length];
        for (int i = 0; i < splitWords.length; i++) {
            reversedArrayWord[i] = splitWords[splitWords.length -1 -i];
        }
        System.out.println(Arrays.toString(reversedArrayWord));
        return String.join(",", reversedArrayWord);
    }

}
