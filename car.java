mport java.util.Scanner;
public class Main {
    public static void main(String[] args) {

boolean startCar = false;
String gear="P";
int speed =0;
int brake=0;
Scanner keyboard =new Scanner(System.in);

System.out.println("-------car dashboard-------");
System.out.println("Speed:"+speed);
System.out.println("Gear:"+gear);
System.out.println("Menu");
System.out.println("1.Turn on/off the engine:");
System.out.println("2.Change gear(P,D,R");
System.out.println("3.Accelerate");
System.out.println("4.brake");
System.out.println("5.exit");
int choice;
do{
System.out.println("Enter your choice:");
 choice =keyboard.nextInt();

switch(choice){
    case 1:
        startCar=!startCar;
        break;
    case 2:
        System.out.println("Enter gear(P,D,R)");
gear=keyboard.next();
break;
    case 3:
        if(startCar && !gear.equals("P")) {
            speed += 10;
            System.out.println("speed="+speed);
            break;
        }
        else{
            System.out.println("cannot accelerate");
            break;

        }
    case 4:
        speed-=5;
        System.out.println("brake speed"+speed);
        break;
    case 5:
        System.out.println("exit");
        break;
    default:
        System.out.println("Invalid");
}
}
while(choice!=5);
keyboard.close();
      

    }
}
