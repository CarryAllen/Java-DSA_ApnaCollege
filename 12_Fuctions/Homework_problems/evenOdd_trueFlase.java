import java.util.*;

public class evenOdd_trueFlase {

    public static void checkEvenOdd (int n) {

        boolean num = true;     

        if (n < 0 ) {
            System.out.println("Enter valid positive number");
        } else if (n % 2 == 0) {
            System.out.println(num + " : Entered number is Even");
        } else {
            num = false;
            System.out.println(num + " : Entered number is Odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number to check Even or odd: ");
        int n  = sc.nextInt();

        checkEvenOdd(n);
    }
}
