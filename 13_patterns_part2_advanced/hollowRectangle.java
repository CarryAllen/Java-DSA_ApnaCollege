public class hollowRectangle {
    public static void hollowRec (int row, int cols) {
        
        //outer loop
        for (int i=1; i<=row; i++) {
            //innerLoop
            for (int j=1; j<=cols; j++) {
                //cell - (i , j)
                if (i == 1 || i == row || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
    }
    public static void main(String[] args) {
        
        hollowRec(4, 5);

    }
}
