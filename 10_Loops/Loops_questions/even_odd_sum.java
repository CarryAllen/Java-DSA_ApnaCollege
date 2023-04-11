//Write a program that reads a set of integers, and then prints the sum of the even and odd integers

/* import java.util.Scanner;

public class even_odd_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the set of integers: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int evenSum = 0;
        int oddSum = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);

        scanner.close();
    }
} */

import java.util.*;

public class even_odd_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int evenSum = 0;
        int oddSum = 0;
        System.out.println("Enter the size of the interger: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Enter your numbers: ");
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int number : numbers){
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        System.out.println("Even sum is: " + evenSum);
        System.out.println("Odd sum is: " + oddSum);
        sc.close();

    }
}