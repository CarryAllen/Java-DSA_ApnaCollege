public class optimizedPrime {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        if(n == 2) {
            return isPrime = false;
        }
        for (int i=2; i<= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return isPrime = false;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(16));
    }
}
