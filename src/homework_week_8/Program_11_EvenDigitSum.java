package homework_week_8;

import java.util.Scanner;

/**
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * getEvenDigitSum(-22); → should return -1 since the number is negative
 */

public class Program_11_EvenDigitSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Any Number : ");
        int number = scan.nextInt();
        scan.close();
        System.out.println("The Sum Of Even Digits Within The Entered Number Is : " + getEvenDigitSum(number));
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number < 0)
            return -1;

        while (number > 0) {
            int evenDigit = number % 10;
            if (evenDigit % 2 == 0)
                sum += evenDigit;
            number /= 10;
        }
        return sum;

    }
}
