import java.util.*;

public class SumInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter Value of b: ");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("Sum of a & b: " +sum);
        sc.close();
    }
}
