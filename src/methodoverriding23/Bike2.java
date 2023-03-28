package methodoverriding23;
// creating a child class
public class Bike2 extends Vehicle{
    // defining the same method as in the parent class
    public void run(){System.out.println("Bike Is Running Safely");}
    public static void main(String[] args){
        Bike2 obj = new Bike2(); // creating an object
        obj.run(); // calling method
    }
}
