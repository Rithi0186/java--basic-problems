import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Welcome to Java program to find Odd Or Even");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        scan.close(); 
    }
}
