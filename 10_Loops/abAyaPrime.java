import java.util.*;

public class abAyaPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        if (n == 2){
            System.out.println("n is prime");
        } else {
            boolean flag = true;
            for (int i=2; i<=n-1; i++) {
                if(n % i == 0) {
                    flag = false;
                }
            }
            if (flag == true) {
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime");
            }
        }
        sc.close();    
    }    
}
