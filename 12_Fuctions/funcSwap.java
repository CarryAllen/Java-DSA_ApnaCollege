public class funcSwap {
    public static void swap (int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("values in function");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        
        
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        swap(a , b);
        System.out.println("values from main function ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
