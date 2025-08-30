
import java.util.Scanner;


public class prime {
    public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter a number to check prime:");
int prime=scan.nextInt();
int count=0;
if (prime==2){
    System.out.println("It is a prime number");}
 else{
        for(int i=2;i<prime;i++){
            if(prime%i==0){
                count++;


            }
        }
    }

if(count==0){
    System.out.println("it is prime");

}
else{
    System.out.print("It is not a prime");
}
    }
    
}
