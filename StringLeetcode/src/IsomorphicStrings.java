import java.util.HashMap;
import java.util.Map;

// Leetcode 205: Isomorphic String
//Input: s = "egg", t = "add"
//Output: true
//Input: s = "foo", t = "bar"
//Output: false
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (!map.containsKey(sChar)){
                if(map.containsValue(tChar)){
                    return false;
                }
                map.put(sChar, tChar);
            }else{
                if(map.get(sChar) != tChar){
                    return false;
                }
            }
        }
        return true;
    }
}
