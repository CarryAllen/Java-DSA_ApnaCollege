import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int factorial = 1;

        if (number < 0) {
            System.out.println("Enter Valid number");
        } else {
            
            for (int i=number; i>=1; i--) {
                factorial = factorial * i;
            }
        }
        System.out.println("Factorial of given number is: " + factorial);
        sc.close();
    }
}
