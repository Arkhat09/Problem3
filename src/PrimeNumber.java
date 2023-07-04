public class PrimeNumber {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 7;

        if (isPrime(n)) {
            System.out.println("7 is a prime number");
        }
        n = 10;
        if (isPrime(n)) {
        } else {
            System.out.println("10 is a composite number");
        }
    }
}