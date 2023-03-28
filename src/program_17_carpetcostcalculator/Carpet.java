package program_17_carpetcostcalculator;

    public class Carpet  {
        private double cost; // Variable declaration

        public Carpet(double cost) { // Parameterized constructor initializing cost
            if (cost < 0) { // Nested if else loop setting cost value according to conditions in requirements
                this.cost = 0.0;
            } else {
                this.cost = cost;
            }
        }

        public double getCost() {
            return this.cost;
        }
    }

