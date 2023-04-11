import java.util.*;

public class Weekday {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Number from 1 to 7 ");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("It's Monday");
                System.out.println();
                break;
            case 2:
                System.out.println("Today is Tuesday");
                System.out.println();
                break;
            case 3:
                System.out.println("Wednesday");
                System.out.println();
                break;
            case 4:
                System.out.println("Thursday");
                System.out.println();
                break;
            case 5:
                System.out.println("Friday");
                System.out.println();
                break;
            case 6:
                System.out.println("Saturday");
                System.out.println();
                break;
            case 7:
                System.out.println("Sunday");
                System.out.println();
                break;
            default:
                System.out.println("Invalid chioce");
                System.out.println();
                break;
        }
        sc.close();
    }
}
