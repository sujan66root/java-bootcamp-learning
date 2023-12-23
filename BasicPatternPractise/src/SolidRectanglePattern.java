public class SolidRectanglePattern {
    public static void main(String[] args) {
        int row = 5;
        int col = 4;
        for (int i = 1; i <= col; i++) {
            for (int j = 1; j <= row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
