public class HollowButterfly {
    public static void main(String[] args) {
        int row = 5;
        //upper half
        for (int i = 1; i <= row ; i++) {
//            left
            for (int j = 1; j <= i; j++) {
                if (i == 1 || j == 1 || j == i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == 1 || j == 1 || j == i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//        lower half
        for (int i = row; i >= 1 ; i--) {
//            left
            for (int j = 1; j <= i; j++) {
                if (i == 1 || j == 1 || j == i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == 1 || j == 1 || j == i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
