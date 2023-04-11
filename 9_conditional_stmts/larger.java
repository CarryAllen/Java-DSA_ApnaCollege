import java.util.*;

public class larger {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
    
        
        if (a >= b && a >= c) {
            System.out.println("A is larger");
        } else if(b >= a && b >= c) {
            System.out.println("b is larger");
        } else {
            System.out.println("c is larger");
        }
        sc.close();
    }
}
