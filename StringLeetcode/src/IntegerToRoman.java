//Leet code 12. Integer to Roman
public class IntegerToRoman {
    public static void main(String[] args) {
        int integerNumber = 1994;
        System.out.println(findIntegerToRoman(integerNumber));
    }
    public static String findIntegerToRoman(int num){
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumbers = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]){
                sb.append(romanNumbers[i]);
                num = num - values[i];
            }
        }
        return sb.toString();
    }
}
