import java.util.*;

//Given an array of strings strs, group the anagrams together.
// You can return the answer in any order.
// Leetcode 49
public class GroupAnagrams {
    public static List<List<String>> groupAnagram(String[] strs){
        Map<String, List<String>> map = new HashMap<>();
        for(String word: strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if (!map.containsKey(sortedWord)){
                map.put(sortedWord,new ArrayList<>());
            }
            map.get(sortedWord).add(word);
            System.out.println(map.values());
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagram(strs));
    }
}
