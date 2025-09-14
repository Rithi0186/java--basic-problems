//find the Frequency of a CharacterInput: "programming", char = 'm' → Output: 2

import java.util.Scanner;
class FrequencyOfChar{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String sen=sc.nextLine();
        char ch=sc.next().charAt(0);
        int count=0;
for(int i=0;i<sen.length();i++){
    char c= sen.charAt(i);
    if(c==ch){  
          count++;
    }
}
System.out.println(count);
    }
}

