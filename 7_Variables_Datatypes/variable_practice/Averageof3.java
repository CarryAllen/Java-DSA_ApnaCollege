import java.util.*;

public class Averageof3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter value of b: ");
        int b = sc.nextInt();
        System.out.println("Enter value of c: ");
        int c = sc.nextInt();
        int n = 3;
        
        int avg = a + b + c / n; 
        
        System.out.println("Average is: "+ avg);
        sc.close();
    }
}
