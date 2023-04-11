public class Inv_half_number {
    public static void inv_half_num (int rows) {
        for (int i=rows; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        inv_half_num(5);
    }
}
