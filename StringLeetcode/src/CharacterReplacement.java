//Leetcode  424:
//You are given a string s and an integer k.
//You can choose any character of the string and change it to any other uppercase English character.
//You can perform this operation at most k times.

import java.util.HashMap;

public class CharacterReplacement {
    public static void main(String[] args) {
        System.out.println(findCharacterLength());
    }
    public static int findCharacterLength(){
        String s = "AABBAAB";
        int k = 1;
        int left = 0; int maxLength = 0; int maxRepeat = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right  = 0; right < s.length(); right++) {
//            map = {};
            char currChar = s.charAt(right);
            map.put(currChar, map.getOrDefault(currChar, 0) + 1);
            maxRepeat = Math.max(maxRepeat, map.get(currChar));
            int nonRepeat = (right -left + 1) - maxRepeat;
            if(nonRepeat > k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
