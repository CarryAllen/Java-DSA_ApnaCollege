import java.util.*;
public class AOC {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println("Area of Circle: "+area);
        sc.close();
    }
}
