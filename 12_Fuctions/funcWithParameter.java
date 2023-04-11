import java.util.*;

public class funcWithParameter {
    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        // System.out.println("Sum of a & b is: "+sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number a: ");
        int a = sc.nextInt();
        System.out.println("Enter number b: ");
        int b = sc.nextInt();
        
        int sum = calculateSum(a, b);
        System.out.println("Sum of a & b is: " + sum);
        sc.close();
    }
}
