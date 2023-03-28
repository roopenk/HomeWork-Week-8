package homework_week_8;

/**
 * You have to represent a point in 2D space. Write a class with the name Point. The class needs two
 * fields (instance variables) with name x and y of type int.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 * constructor). The second constructor has parameters x and y of type int and it needs to initialize the
 * fields.
 * Write the following methods (instance methods):
 * Method named getX without any parameters, it needs to return the value of x field.
 * Method named getY without any parameters, it needs to return the value of y field.
 * Method named setX with one parameter of type int, it needs to set the value of the x field.
 * Method named setY with one parameter of type int, it needs to set the value of the y field.
 * Method named distance without any parameters, it needs to return the distance between this
 * Point and Point 0,0 as double.
 * Method named distance with two parameters x, y both of type int, it needs to return the distance
 * between this Point and Point x,y as double.
 * Method named distance with parameter another of type Point, it needs to return the distance
 * between this Point and another Point as double.
 * How to find the distance between two points?
 * To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
 * d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
 * Where √ represents square root.
 * TEST EXAMPLE
 * → TEST CODE: Write the below code into the main method.
 * Point first = new Point(6, 5);
 * Point second = new Point(3, 1);
 * System.out.println("distance(0,0)= " + first.distance());
 * System.out.println("distance(second)= " + first.distance(second));
 * System.out.println("distance(2,2)= " + first.distance(2, 2));
 * Point point = new Point();
 * System.out.println("distance()= " + point.distance());
 * OUTPUT
 * distance(0,0)= 7.810249675906654
 * distance(second)= 5.0
 * distance(2,2)= 5.0
 * distance()= 0.0
 * NOTE: Use Math.sqrt to calculate the square root √.
 * NOTE: Try to avoid duplicated code.
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 7 methods.
 */

public class Program_16_Point2DSpace {
    public static class Point {
        private int x; // Integer declaration
        private int y; // Integer declaration

        public Point() { // no args constructor
            this(0, 0);
        }

        public Point(int x, int y) { // Constructor with two int parameters
            this.x = x;
            this.y = y;
        }

        public int getX() { // int type method returning value of x
            return x;
        }

        public void setX(int x) { // void type with return method setting value of x
            this.x = x;
        }

        public int getY() { // int type method returning value of y
            return y;
        }

        public void setY(int y) { // void type method setting value of y
            this.y = y;
        }

        public double distance() { // method with logic to return distance in decimal number between point & point 0,0
            return Math.sqrt(this.x * this.x + this.y * this.y);
        }

        public double distance(int x, int y) { // same method with parameters & logic to return distance in decimal number between point & point x,y
            return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * ((this.y - y)));
        }

        public double distance(Point xy) { // same method with parameters & logic to return distance in decimal between point & another point
            return Math.sqrt((this.x - xy.x) * (this.x - xy.x) + (this.y - xy.y) * (this.y - xy.y));
        }
    }

    public static void main(String[] args) {// Main method with Test code
        Point first = new Point(6, 5); // Object creation with values
        Point second = new Point(3, 1); // object creation with different set of values
        System.out.println("distance(0,0)= " + first.distance()); // calling distance method with first value
        System.out.println("distance(second)= " + first.distance(second)); // calling distance method providing different values
        System.out.println("distance(2,2)= " + first.distance(2, 2)); // calling distance method with given values
        Point point = new Point(); // Default object creation
        System.out.println("distance()= " + point.distance()); // Calling distance method as is without giving values
    }


}
