//this is floyd's triangle using numbers

public class Floyds_Triangle {
    public static void floyed(int rows) {
        int num = 1;
        for (int i=1; i<=rows; i++) {
            for (int j=1; j<=i ;j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyed(5);
    }
}
