//reverse of string
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sen=sc.nextLine();
        String rev="";
        for(int i=0;i<sen.length();i++){
            char c= sen.charAt(i);
            rev=c+rev;

        }
        System.out.println(rev);
    }
}
