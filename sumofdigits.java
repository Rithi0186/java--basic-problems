import java.util.Scanner;
public class sum {
    public static void main(String args[]){
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter a number:");
int num =keyboard.nextInt();
int newNo =num;
int sum=0;
int i=1;
int lastDig=0;
int size = String.valueOf(num).length();

while(i<= size){
lastDig=newNo%10;
sum+=lastDig;
newNo=newNo/10;
i++;

}
System.out.println("The Sum of entered number is:"+sum);

    }
}
