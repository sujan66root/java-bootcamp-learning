public class Diamond {
    public static void main(String[] args) {
        int rows = 4;
//        upper half
        for (int i = 1; i <= rows ; i++) {
//            printing space
            for (int j = 1; j <= 2 * (rows - i) ; j++) {
                System.out.print(" ");
            }
//            printing space
            for (int j = 1; j <= 2 * i - 1; j++) {
//                for pyramid, you need to print additional space..
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = 4; i >=  1 ; i--) {
            for (int j = 1; j <= 2 * (rows - i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
