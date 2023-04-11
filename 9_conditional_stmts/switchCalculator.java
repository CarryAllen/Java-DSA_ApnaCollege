import java.util.*;

public class switchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        System.out.println();
        System.out.println("===== Menu =====");
        System.out.println("1. Addition");
        System.out.println("2. Multiplcation");
        System.out.println("3. Substraction");
        System.out.println("4. division");
        System.out.println("5. Modulo");
        System.out.println("================");
        
        System.out.println();
        System.out.print("Ente your choice: ");
        int number = sc.nextInt();
        int result;
        System.out.println();

        switch(number){
            case 1: 
                result = a + b;
                System.out.println("Adddition is: "+ result);
                System.out.println();
                break;
            case 2:
                result = a * b;
                System.out.println("Multiplication is: "+ result);
                System.out.println();
                break;
            case 3:
                result = a - b;
                System.out.println("Substraction is: "+ result);
                System.out.println();
                break;
            case 4:
                result = a / b;
                System.out.println("Division is: "+ result);
                System.out.println();
                break;
            case 5:
                result = a % b;
                System.out.println("Modulo is: "+ result);
                System.out.println();
                break;
            default:
                System.out.println("Please enter valid choice");
                System.out.println();
                break;        
        }
        sc.close();
    }
}
