import java.util.*;

public class avg {

    public static double calculate_Average (double a, double b, double c) {
        int n = 3;
        double average = a + b + c / n;

        return average;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter value of a:" );
        double a = sc.nextDouble();
        System.out.println("Enter value of b:" );
        double b = sc.nextDouble();
        System.out.println("Enter value of c:" );
        double c = sc.nextDouble();

        double avgerage = calculate_Average(a, b, c);
        System.out.println("Average of a , b & c is: " + avgerage);
    }
}
