public class solid_rhombus {
    public static void rhombus (int rows) {
        
        for(int i=1; i<=rows; i++) {
            ///for spaces
            for (int j=1; j<=2*(rows-i); j++) {
                System.out.print(" ");
            }

            //for stars
            for (int j=1; j<=rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rhombus(6);
    }
}
