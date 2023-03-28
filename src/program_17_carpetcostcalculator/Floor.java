package program_17_carpetcostcalculator;

public class Floor {

        private double width; // Variable 1
        private double length; // Variable 2

        public Floor(double width, double length) { // Parameterized constructor initializing the values
            if (width > 0 && length < 0) { // Nested if else to set values according to conditions given in requirement
                this.width = width;
                this.length = 0.0;
            } else if (width < 0 && length > 0) {
                this.width = 0.0;
                this.length = length;
            } else if (width < 0 && length < 0) {
                this.width = width;
                this.length = length;
            } else {
                this.width = width;
                this.length = length;
            }
        } public double getArea() { // method calculating and returning area
        return this.width * this.length;
    }
}


