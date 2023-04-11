import java.util.*;

public class itemsAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter value of Pencil: ");
        float Pencil = sc.nextFloat();
        System.out.println("Enter value of Pen: ");
        float Pen = sc.nextFloat();
        System.out.println("Enter value of Erasor: ");
        float Erasor = sc.nextFloat();

        
        int cost = (int) (Pencil + Pen + Erasor);   //type conversion
        double GST = cost * 18 / 100;
        double Total_Cost = (double) (cost + GST);

        System.out.println();
        System.out.println("The Final bill on purched itmes");
        System.out.println("GST: " + GST);
        System.out.println("cost: " + cost);
        System.out.println("Total Amount of purchased items is: "+Total_Cost);
        System.out.println();
        sc.close();
    }
}
