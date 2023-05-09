import java.util.*;

public class palindrome {
    public static int check_palindrome (int number) {
        int palindrome = number ;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10 ;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number to check palindrome: ");
        int palindrome = sc.nextInt();

        if(check_palindrome(palindrome)) {
            System.out.println("Number: "+ palindrome +"is a palindrome number");
        }else {
            System.out.println("Number: "+ palindrome +"is a not palindrome number");
        }
    }
}
