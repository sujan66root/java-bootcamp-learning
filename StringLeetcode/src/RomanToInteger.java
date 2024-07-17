import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args){
        String s = "MCMXCIV";
        System.out.println(convertRomanToInt(s));
    }
    public static int convertRomanToInt(String s){
        Map<Character, Integer> romanInt = new HashMap<>();
        romanInt.put('I', 1);
        romanInt.put('V', 5);
        romanInt.put('X', 10);
        romanInt.put('L', 50);
        romanInt.put('C', 100);
        romanInt.put('D', 500);
        romanInt.put('M', 1000);
        int result = romanInt.get(s.charAt(s.length()-1));
        for (int i = s.length() - 1; i > 0 ; i--) {
            if(romanInt.get(s.charAt(i))>romanInt.get(s.charAt(i-1))){
                result = result - romanInt.get(s.charAt(i-1));
            }else{
                result = result + romanInt.get(s.charAt(i-1));
            }
        }
        return result;
//        Another Approach using char array
//        char[] ch = s.toCharArray();
//        int result = romanInt.get(ch[ch.length-1]);
//        for (int i = ch.length-1; i > 0 ; i--) {
//            if(romanInt.get(ch[i])>romanInt.get(ch[i-1])){
//                result = result - romanInt.get(ch[i-1]);
//            }else{
//                result = result + romanInt.get(ch[i-1]);
//            }
//        }
//        return result;
    }
}
