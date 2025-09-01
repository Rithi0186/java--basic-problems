class Car {
    // Attributes (member variables) define a Car's properties
    String make;
    String model;
    String color;

     // No-argument constructor (no parameters)
    public Car() {
        this.make = "Unknown"; // Set a placeholder make
        this.model = "Unknown"; // Set a placeholder model
        this.color = "Black"; // Set a default color
    }

    // Parameterized constructor to initialize with specific values
    public Car(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    // Method (action) to accelerate the Car
    public void accelerate() {
        System.out.println("The car is accelerating!");
    }

    // Method (action) to turn the Car
    public void turn() {
        System.out.println("The car is turning!");
    }
 public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        // Create a red Colorado with a no-argument constructor
        Car colorado = new Car();
        // Change the default make "Unknown" to "Chevrolet"
        colorado.make = "Chevrolet";
        // Change the default model "Unknown" to "Colorado"
        colorado.model = "Colorado";
        // Change the default color "Black" to "Red"
        colorado.color = "Red";

       // Make the Colorado accelerate
       colorado.accelerate();
       
       // Create a blue Mustang with the parameterized constructor
       Car mustang = new Car("Ford", "Mustang", "Blue");

       // Make the Mustang turn
       mustang.turn();

       // Print the Colorado
       System.out.println(colorado);

       // Print the Mustang
       System.out.println(mustang);

    }
}
