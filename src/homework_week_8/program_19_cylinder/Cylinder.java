package homework_week_8.program_19_cylinder;


public class Cylinder extends Circle { // cylinder class extending circle class
    private double height; // double type variable declaration

    public Cylinder(double radius, double height) { // Parameterised constructor
        super(radius); // Calling constructor from parent class
        this.height = height < 0 ? 0 : height; // setting value of height using ternary operator in case entered value is 0
    }

    public double getHeight() { // method returning value of height
        return height;
    }

    public double getVolume() { // method returning calculated volume
        return getArea() * getHeight();
    }
}

