//HomeWork Problem

import java.util.*;

public class posOrNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        System.out.println();

        if(number > 0) {
            System.out.println("Number is positive");
            System.out.println();
        } else {
            System.out.println("Number is Negative");
            System.out.println();
        }
        sc.close();
    }
}
