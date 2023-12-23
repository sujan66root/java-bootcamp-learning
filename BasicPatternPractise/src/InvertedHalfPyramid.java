public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            for (int j = 4; j >= i  ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
