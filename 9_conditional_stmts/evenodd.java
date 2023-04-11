import java.util.*;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number id odd");
        }
        sc.close();
    }
}
