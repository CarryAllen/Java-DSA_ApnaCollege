import java.util.*;

public class giveInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int marks[]= new int [100];

        System.out.println("length of an array: " + marks.length);

        System.out.print("Enter phy marks:");
        marks[0] = sc.nextInt();
        System.out.print("Enter chem marks:");
        marks[1] = sc.nextInt();
        System.out.print("Enter math marks:");
        marks[2] = sc.nextInt();

        System.out.println();

        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("math : " + marks[2]);

        //marks[2]= 100; // can update values
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage: " + percentage + "%");


    }
}
