package program_17_carpetcostcalculator;

public class Calculator {
    private Floor floor; // Variable declaration
    private Carpet carpet; // Variable declaration

    public Calculator(Floor floor, Carpet carpet) { // Parameterised constructor initializing floor & carpet variables
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() { // Return type method to return total cost by multiplying floor area and carpet cost
        return floor.getArea() * carpet.getCost();
    }
}

