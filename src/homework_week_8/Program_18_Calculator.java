package homework_week_8;

/**
 * Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
 * names firstNumber and secondNumber both of type double.
 * Write the following methods (instance methods):
 * ● Method named getFirstNumber without any parameters, it needs to return the value of the
 * firstNumber field.
 * ● Method named getSecondNumber without any parameters, it needs to return the value of
 * the secondNumber field.
 * ● Method named setFirstNumber with one parameter of type double, it needs to set the value
 * of the firstNumber field.
 * ● *Method named setSecondNumber with one parameter of type double, it needs to set the
 * value of the secondNumber field.
 * ● Method named getAdditionResult without any parameters, it needs to return the result of
 * adding the field values of firstNumber and secondNumber.
 * ● Method named getSubtractionResult without any parameters, it needs to return the result of
 * subtracting the field values of the secondNumber from the firstNumber.
 * ● Method named getMultiplicationResult without any parameters, it needs to return the result
 * of multiplying the field values of firstNumber and secondNumber.
 * ● Method named getDivisionResult without any parameters, it needs to return the result of
 * dividing the field values of firstNumber by the secondNumber. In case the value of
 * secondNumber is 0 then return 0.
 * TEST EXAMPLE
 * TEST CODE: Write the bellow code into main method
 * SimpleCalculator calculator = new SimpleCalculator();
 * calculator.setFirstNumber(5.0);
 * calculator.setSecondNumber(4);
 * System.out.println("add= " + calculator.getAdditionResult());
 * System.out.println("subtract= " + calculator.getSubtractionResult());
 * calculator.setFirstNumber(5.25);
 * calculator.setSecondNumber(0);
 * System.out.println("multiply= " + calculator.getMultiplicationResult());
 * System.out.println("divide= " + calculator.getDivisionResult());
 * OUTPUT
 * add= 9.0
 * subtract= 1.0
 * multiply= 0.0
 * divide= 0.0
 * TIPS:
 * ● add= 9.0 is printed because 5.0 + 4 is 9.0
 * ● subtract= 1.0 is printed because 5.0 - 4 is 1.0
 * ● multiply= 0.0 is printed because 5.25 * 0 is 0.0
 * ● divide= 0.0 is printed because secondNumber is set to 0
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 8 methods.
 */

public class Program_18_Calculator {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator(); // Object creation
        calculator.setFirstNumber(5.0); // Calling setFirstNumber method providing value
        calculator.setSecondNumber(4); // Calling setSecondNumber method providing value
        System.out.println("add= " + calculator.getAdditionResult()); // getting Addition result value
        System.out.println("subtract= " + calculator.getSubtractionResult()); // getting subtraction result value
        calculator.setFirstNumber(5.25); // Calling setFirstNumber method providing different value
        calculator.setSecondNumber(0); // Calling setSecondNumber method providing different value
        System.out.println("multiply= " + calculator.getMultiplicationResult()); // getting multiplication result value
        System.out.println("divide= " + calculator.getDivisionResult()); // getting division result value
    }

    public static class SimpleCalculator { // Static class with two double variables
        private double firstNumber;
        private double secondNumber;

        public double getFirstNumber() { // Method returning value of first number
            return firstNumber;
        }

        public double getSecondNumber() { // Method returning value of second number
            return secondNumber;
        }

        public void setFirstNumber(double firstNumber) { // Method setting the value of first number
            this.firstNumber = firstNumber;
        }

        public void setSecondNumber(double secondNumber) { // Method setting the value of second number
            this.secondNumber = secondNumber;
        }

        public double getAdditionResult() { // Method adding and returning values of first and second number
            return firstNumber + secondNumber;
        }

        public double getSubtractionResult() { // Method subtracting and returning values of first and second number
            return firstNumber - secondNumber;
        }

        public double getMultiplicationResult() { // Method Multiplying and returning values of first and second number
            return firstNumber * secondNumber;
        }

        public double getDivisionResult() { // Method checking second number value first and returning division result
            // according to if else statement
            if (secondNumber == 0) {

                return this.secondNumber = 0;

            } else {

                return firstNumber / secondNumber;
            }
        }
    }

}
