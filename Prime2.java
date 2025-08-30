import java.util.Scanner;

public class Prime2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check prime:");
        int n = scan.nextInt();

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;  // numbers <=1 are not prime
        } 
        else if (n == 2 || n == 3) {
            isPrime = true;   // 2 and 3 are prime
        } 
        else if (n % 2 == 0) {
            isPrime = false;  // even numbers > 2 are not prime
        } 
        else {
            // check odd divisors only, up to sqrt(n)
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    isPrime = false;
                    break;  // stop early if factor found
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a Prime number");
        } else {
            System.out.println(n + " is NOT a Prime number");
        }
    }
}
