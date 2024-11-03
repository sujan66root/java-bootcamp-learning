// leetcode 345 Easy Blind 75 : reverse vowels in String
import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsInString {
    public String reverseVowels(String s) {

//        store all the vowels in a set
        Set<Character> vowelSet = new HashSet<>();
        for(char ch : "aeiouAEIOU".toCharArray()){
            vowelSet.add(ch);
        }
//        use two pointers
        int left = 0, right = s.length()-1;
//        convert the strings into character array
        char[] charString = s.toCharArray();
        while(left < right){
//            while loop and not if because we need to find the vowel and increase until we find
            while(left < right && !vowelSet.contains(charString[left])){
                left++;
            }
            while(left < right && !vowelSet.contains(charString[right])){
                right--;
            }
//            swap if both are vowels;
            char temp = charString[left];
            charString[left] = charString[right];
            charString[right] = temp;
            left++;
            right--;
        }
        return new String(charString);
    }
}
