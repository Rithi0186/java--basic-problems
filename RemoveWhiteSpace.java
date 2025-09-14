
import java.util.Scanner;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();

        String str="";
        for (int i=0;i<sen.length();
        i++){
            char c= sen.charAt(i);
            if(!(Character.isWhitespace(c))){
                str+=c;

            }
        }
        System.out.println(str);
    }
}
