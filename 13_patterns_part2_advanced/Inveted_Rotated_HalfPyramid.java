public class Inveted_Rotated_HalfPyramid {
    public static void Inv_half(int rows) {
        for (int i=1; i<=rows; i++) {
            //spaces
            for (int j=1; j<=rows-i; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Inv_half(5);
    }
}
