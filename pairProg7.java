public class pairProg7 {
    public static void main(String[] args) {
        int number = 29; // You can change this number to test other numbers.
        boolean isPrime = isPrime(number);
        System.out.println("Is " + number + " a prime number? " + isPrime);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
