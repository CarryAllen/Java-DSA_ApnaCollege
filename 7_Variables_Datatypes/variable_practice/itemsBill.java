import java.util.*;

public class itemsBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter value of Pencil: ");
        float Pencil = sc.nextFloat();
        System.out.println("Enter value of Pen: ");
        float Pen = sc.nextFloat();
        System.out.println("Enter value of Erasor: ");
        float Erasor = sc.nextFloat();

        int Total_Amount = (int) (Pencil + Pen + Erasor);   //type conversion

        System.out.println("Total Amount of purchased items is: "+Total_Amount);
        sc.close();
    }
}
