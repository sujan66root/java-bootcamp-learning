public class HollowRectangle {
    public static void main(String[] args) {
        int rows = 4;
        int col = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == rows || j == 1 || j == col){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
