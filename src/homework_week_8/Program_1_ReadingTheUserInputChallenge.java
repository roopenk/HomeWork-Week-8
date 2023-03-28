package homework_week_8;
/**
 * A Java program to Read 10 numbers from the console entered by the user and
 * print the sum of those numbers.
 */

import java.util.Scanner;

public class Program_1_ReadingTheUserInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        int n = 1;

        while (true && n <= 10) {
            System.out.println("Please Enter Number #" + n + " : ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int num = scanner.nextInt();
                counter++;
                sum += num;
                n++;
            } else {
                System.out.println("Invalid Number Entered");
                break;
            }
        }
        scanner.nextLine();

        System.out.println("The Sum Of Entered Numbers Is : " + sum);
        scanner.close();
    }
}


