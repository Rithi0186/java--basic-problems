import java.util.Scanner;

public class leap {
    public static void main(String args[]){
        System.out.println("Enter a year");
        Scanner scan = new Scanner(System.in);
        int Leapyear = scan.nextInt();
        if ((Leapyear%4==0)&&(Leapyear%100!=0)|| (Leapyear % 400 == 0) ){
            System.out.println("Leap year");
            
        }
        else{
            System.out.println("normal year");
        }

    }
    
}
