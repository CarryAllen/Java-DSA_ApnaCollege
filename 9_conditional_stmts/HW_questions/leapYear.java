import java.util.*;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Year (only 4 digits)");
        int year = sc.nextInt();
        boolean leap = false;
        
        if (year % 4 == 0) {
            if (year % 400 == 0) {
                if (leap = true) {
                    leap = false;
                } else {
                    leap = true;
                }
            }
        }
        if (leap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not leap year.");
        }
        sc.close();
    }
}
