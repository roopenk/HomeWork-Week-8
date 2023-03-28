package homework_week_8;

import java.util.Scanner;

/**
 * A Java  program to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */

public class Program_12_PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Any Number : ");
        int number = scan.nextInt();
        scan.close();
        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i) {

            if (number % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(number + " Is A Prime Number.");
        else
            System.out.println(number + " Is Not A Prime Number.");
    }
}
