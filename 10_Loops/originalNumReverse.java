public class originalNumReverse {
    public static void main(String[] args) {
        int n = 10899;
        int rev = 0; //rev = (rev * 10) + lastDgit

        while (n > 0) {
            int lastDgit = n % 10;
            rev = (rev * 10) + lastDgit;
            n = n /10;
            
        }
        System.out.println(rev + " ");
        System.out.println();
    }
}
