package homework_week_8;

import java.util.Scanner;

/** A Java program to read the numbers from the console entered by the user
 * and print the minimum and maximum number the user has entered
 */

public class Program_2_MinAndMaxInputChallenge {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;


        while (true) {
            System.out.println("Please Enter A Number : ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int num = scanner.nextInt();
                if(num > maximum){
                    maximum = num;
                }
                if (num<minimum) {
                    minimum = num;
                }
            } else {
                System.out.println("Invalid Number Entered");
                break;
            }
        }
        scanner.nextLine();

        System.out.println("The Maximum Number Entered Is : " + maximum);
        System.out.println("The Minimum Number Entered Is : " + minimum);
        scanner.close();
    }
}


