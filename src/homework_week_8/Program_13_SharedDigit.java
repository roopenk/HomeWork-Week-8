package homework_week_8;
/**
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */

import java.util.Scanner;

public class Program_13_SharedDigit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter First Number : ");
        int fNumber = scan.nextInt();
        System.out.println("Please Enter Second Number : ");
        int sNumber = scan.nextInt();
        scan.close();
        System.out.println(hasSharedDigit(fNumber, sNumber));

    }

    public static boolean hasSharedDigit(int fNumber, int sNumber) {
        if ((fNumber < 10 || fNumber > 99) || (sNumber < 10 || sNumber > 99)) {
            return false;
        }
        int a = fNumber;
        int b = sNumber;
        while (a != 0) {
            while (b != 0) {
                if ((a % 10) == (b % 10)) {
                    return true;
                }
                b /= 10;
            }
            a /= 10;
        }
        return false;

    }

}


