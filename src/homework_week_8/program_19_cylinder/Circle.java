package homework_week_8.program_19_cylinder;

public class Circle {
     // Class
        private double radius; // Double variable

        public Circle(double radius) { // Parameterised constructor initialising variable
            this.radius = radius < 0 ? 0 : radius; // ternary operator setting variable to 0 if 0 has been entered
        }

        public double getRadius() { // method returning value of radius
            return radius;
        }

        public double getArea() { // method returning value of area
            return getRadius() * getRadius() * Math.PI;
        }
    }

