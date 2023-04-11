public class Hollow_Rhombus {
    public static void HollowRhombus(int rows) {

        //spaces
        for(int i=1; i<=rows; i++) {
            for (int j=1; j<=(rows-i); j++) {
                System.out.print(" ");
            }
            //stars for hollow rhombus
            for (int j=1; j<=rows; j++) {
                if( i==1 || i==rows || j==1 || j==rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }    
    }
    public static void main(String[] args) {
        HollowRhombus(5);
    }
}
