public class Permutation {
    public int printPermutation(String str, String permutations, int index) {
        if (str.isEmpty()) {
            System.out.println(permutations);
            return 1;
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            count += printPermutation(newString, permutations + currentChar, index + 1);
        }
        return count;
    }
}
