// package Advance_Pattern_HW;

public class rhombus {
    public static void main(String[] args) {
        int n = 5, m=5;

        for (int i=1; i<=n; i++) {
            //for spaces
            for (int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            //for right side stars
            for (int j=1; j<=n; j++) {
                if (i==1||j==1||i==m||j==m){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
