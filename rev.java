public class rev {
    public static void main(String[] args) {
        int num=4568907;
   
        int rev=0;
        while(num>0){
            int digit =num%10;
            rev=rev*10+digit;
            num=num/10;

        }
        System.out.println("The reversed number is:"+rev);
    }
}
