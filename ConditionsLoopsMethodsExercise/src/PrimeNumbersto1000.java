public class PrimeNumbersto1000 {

    // Prime numbers up to 1000
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
