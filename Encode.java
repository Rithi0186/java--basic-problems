
import java.util.Scanner;

//to move 2 char
public class Encode {
   public static void main(String[] args) {
       Scanner ss=new Scanner(System.in);
       String sen =ss.nextLine();
       String enc="";
       for(int i=0;i<sen.length();i++){
        char c=sen.charAt(i);
        if(c=='y'||c=='Y'||c=='Z'||c=='z')
        {
         c-=26;}
         c+=2;
         enc+=c;
       }
       System.out.println(enc);

   } 
}
