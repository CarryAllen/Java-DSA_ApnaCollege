import java.util.*;

public class product_ab {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter Value of b: ");
        int b = sc.nextInt();

        int product = a * b;
        System.out.println("Product of a & b: " +product);
        sc.close();
    }
}
