import java.util.*;

public class shrdhaKiCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();

        System.out.println();
        System.out.println("====== Menu =======");
        System.out.println("+ for Addition");
        System.out.println("- for Substracion");
        System.out.println("* for Multiplciation");
        System.out.println("/ for Division");
        System.out.println("% for Modulo");
        System.out.println("===================");
        System.out.println();
        System.out.println("Entet Operatr to perform action: ");
        char operator = sc.next().charAt(0);
        System.out.println();

        switch (operator) {
            case '+':
                System.out.println("Addition is: " + (a+b));
                System.out.println();
                break;
            case '-':
                System.out.println("Substraction is: " + (a-b));
                System.out.println();
                break;
            case '*':
                System.out.println("Multiplication is: " + (a*b));
                System.out.println();
                break;
            case '/':
                System.out.println("Division is: " + (a/b));
                System.out.println();
                break;
            case '%':
                System.out.println("Modulo is: " + (a%b));
                System.out.println();
                break;
        
            default:
                System.out.println("Invalid Operator entered");
                System.out.println();
                break;
        }
        sc.close();
    }
}
