import java.util.*;

public class oneToN {
    public static void main(String[] args) {
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: ");
        int range = sc.nextInt();
        while(counter <= range) {
            System.out.print(counter+" ");
            counter++;
        }
        sc.close();
    }
}
