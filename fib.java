import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int end=sc.nextInt();
        int a=0;
        int b=1;
        int c,i;

        System.out.println("The Fibonoci series:");
        if (end >= 1) System.out.print(a + "\t");
        if (end >= 2) System.out.print(b + "\t");
        for(i=3;i<=end;i++){
            c=a+b;
            System.out.print(c+"\t");

            a=b;
            b=c;
           
        }

    }
}
