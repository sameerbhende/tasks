/* 1. Handle Input: Currently, the number to check if it's prime is hardcoded.
 You might want to modify the program to accept input from the user.
 
 
 2. Extend Functionality: Consider adding functionality to check a range of numbers for 
 prime status and print all prime numbers within that range
 
 
 
 */

 import java.util.Scanner;

public class refinePairProg7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting number of the range:");
        int start = scanner.nextInt();
        System.out.println("Enter the ending number of the range:");
        int end = scanner.nextInt();
        scanner.close();

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
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

