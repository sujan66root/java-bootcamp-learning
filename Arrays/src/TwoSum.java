public class TwoSum {
    public static int[] find(int[] input, int output){
        for (int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length; j++) {
                if(input[i] + input[j] == output){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{};
    }
}
