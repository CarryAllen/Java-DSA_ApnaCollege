//this is zero one triangle program using zero one

public class zeroOne_triangle {

    public static void Zero_one (int rows) {
        for (int i=1; i<=rows; i++) {
            for(int j=1; j<=i; j++) {
                int sum = i+j;
                if (sum % 2 == 0) {
                    System.out.print("1");
                } else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Zero_one(5);
    }
}
