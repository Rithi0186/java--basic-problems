
import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] a= new int[4];
        for(int i=0;i<4;i++){
            a[i]=sc.nextInt();
        }
        for(int as:a){
            System.out.println(as);
        }
        System.out.println("Enter the postion to rotate");
        int d=sc.nextInt();
        if(d<0){
            d=d+a.length;
        }
        d=d%a.length;
for(int j=0;j<d;j++){
        int temp=a[0];
        for(int i=1;i<a.length;i++ ){
            a[i-1]=a[i];

        }
        a[a.length-1]=temp;
    }
    for(int as:a){
        System.out.print(as);
    }
    }
}
