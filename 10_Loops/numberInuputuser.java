// keep entring the number till user enters a multiple of 10
import java.util.*;

public class numberInuputuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        do {
            System.out.print("Enter number multiple of 10: ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }
            System.out.println("you entered: "+n);
            System.out.println();
            
        } while(true);
        
        sc.close();
    }
}
