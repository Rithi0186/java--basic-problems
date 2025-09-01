
import java.util.Scanner;


public class palindrom {
   public static void main(String[] args) {
       Scanner keyboard =new Scanner(System.in);
       System.out.println("Enter a number:");
       int num =keyboard.nextInt();
       int og = num;
    int rev=0;
       while(num>0){
        int ld =num%10;
        rev=rev*10+ld;
        num=num/10;

       }
       if(og==rev){
        System.out.print("Palindrome");
       }
       else{
        System.out.println("Not palindrome");
       }

   } 
}

