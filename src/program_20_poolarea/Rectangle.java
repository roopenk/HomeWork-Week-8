package program_20_poolarea;

    public class Rectangle {
        private double width; // Integer declaration
        private double length; // Integer declaration

        public Rectangle(double width, double length) { // Parameterised constructor initializing variables
            this.width = width < 0 ? 0 : width; // setting width value using ternary operator
            this.length = length < 0 ? 0 : length; // setting length value using ternary operator
        }

        public double getWidth() { // method returning width value
            return width;
        }

        public double getLength() { // method returning length value
            return length;
        }

        public double getArea() { // method calculating and returning area value
            return this.width * this.length;
        }
    }


