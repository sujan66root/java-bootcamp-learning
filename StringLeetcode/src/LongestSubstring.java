import java.util.Arrays;
import java.util.HashSet;

// leetcode 3. Longest Substring Without Repeating Characters
//Given a string s, find the length of the longest substring without repeating characters.
//I have done extra to take out the substring as well
public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcefabcdebb";
        Result result = findLongestSubstring(s);
        System.out.println("Length of Longest String:" + result.maxLength);
        System.out.println("Longest String: "+result.longestString);
    }
    public static Result findLongestSubstring(String s){
        HashSet<Character> substrng = new HashSet<>();
        int left = 0; int maxLength = 0; int right = 0;
        int start = 0;
        while(right<s.length()){
            if(!substrng.contains(s.charAt(right))){
                substrng.add(s.charAt(right));
                if(right-left+1 > maxLength){
                    maxLength = right-left+1;
                    start = left;
                }
                right++;
            }else{
                substrng.remove(s.charAt(left));
                left++;
            }
        }
        return new Result(maxLength, s.substring(start, start+maxLength-1));
    }
    public static class Result{
        int maxLength;
        String longestString;
        Result(int maxLength, String substrng){
            this.maxLength = maxLength;
            this.longestString = substrng;
        }
    }

}
