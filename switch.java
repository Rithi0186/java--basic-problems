import java.util.Scanner;
// Beginning of the main class. The name of the main class and the file should be same.
public class Main {

    // Beginning of main method - a program starts from this method and ends here
    public static void main(String []args) {

        /** TODO 2: Create a Scanner variable named "keyboard" **/
        Scanner keyboard = new Scanner(System.in);
        int subhCoice;
        String subMenu ="1. Yes,I had my breakfast \n 2.No,I would like one";


System.out.println("");
        /** TODO 3: A variable for getting the day of the week is given below **/
        /**         Initialize the variable to have the value 1 **/
        /** 1- is Monday, 2- is Tuesday and so on **/
        int dayOfTheWeek=1;

        /** TODO 4: Display a menu to get the day of the week from the user **/
        String menu= """
              
        /**

         ********** MENU *****************
         These are the choices for week of the day. \n Please enter only values from 1-7:
         1. MONDAY
         2. TUESDAY
         3. WEDNESDAY
         4. THURSDAY
         5. FRIDAY
         6. SATURDAY
         7. SUNDAY
         ***********************************

         **/""";
        System.out.println(menu);

        /** TODO 5: Prompt Toni for input. Also let Toni know the valid choices like (1-7). **/
        System.out.println("Enter a value from 1-7");
        dayOfTheWeek = keyboard.nextInt();

        /** TODO 6: Create a switch with case values from 1-7 to handle the schedule **/
        /**         for the input in "dayOfTheWeek" **/
        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Monday: It is back to work.....");
                System.out.println(subMenu);
System.out.println("Choose one(1/2"));
subhCoice=keyboard.nextInt();
if(subhCoice==1) {

    System.out.println("Good,you can catchup your car and prepare notes");
}
else if(subhCoice==2){
                System.out.println("take diversion for burger shop");}
else{
                System.out.println("no such choice available");}
break;
            case 2:
                System.out.println("Tuesday :It is Second day to tolerate");
                break;
                case 3:
                    System.out.println("Wednesday:Today you have a event");
                    break;
            case 4:
                System.out.println("Thrusday:2 days for weekend");
                break;
            case 5:
                System.out.println("Friday:1 more day");
                break;

            case 6:
                System.out.println("Saturday:happy weekend");
                break;

            case 7:
                System.out.print("end of weekend");
                break;
            default:
                System.out.println("Invalid");
                break;
            /** TODO 6(a): Implement all other cases for Tuesday to Sunday **/

            /** TODO 6(b): Implement "default" to handle Toni entering  **/
            /**            values less than 1 or more than 7 **/
        }

        /** TODO 7: Introduce a "break" after each case code, except the last  **/

        /** TODO 8: Go below the TODO 2 after the creation of Scanner variable  **/
        /**         and declare a variable "subChoice" **/

        /** TODO 9: Move below the display "Monday: It is back to work....." **/
        /**         in case 1 and create a menu  **/
        /** The sub-menu inside case 1 show appear as below:

         *********** SUB MENU FOR MONDAY ******
         * 1. Yes, I had my breakfast
         2. No, I would like one
         **************************************

         **/

        /** TODO 10: After the sub-menu inside case 1, prompt for input on choice **/
        /**         from Toni and store it in the variable subChoice **/

        /** TODO 11: Display appropriate response to Toni, based on value in **/
        /**          variable subChoice using if, if-else, else **/
        /**
         1. When subChoice has value of 1 display -
         Good. Now you have a catchup meeting at 9AM Prepare your notes

         2. When subChoice has value of 2 display -
         Lets us divert on Highway 54 and have a Burger on the drive in

         3. When subChoice has any other value then 1 or 2 display -
         NO such choice available
         **/


    } //end of main method

} //end of the main clas
