public class searchValue {
    public static int[] linearSearch(int[] values, int searchFor){
        for (int i = 0; i < values.length; i++) {
            if(values[i] == searchFor){
                return new int []{values[i], i};
            }
        }
        return new int[]{};
    }
}
