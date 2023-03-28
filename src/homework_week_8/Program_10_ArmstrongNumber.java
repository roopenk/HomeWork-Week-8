package homework_week_8;
/**
 * A Java program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

import java.util.Scanner;

public class Program_10_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Any Number : ");
        int number = scan.nextInt();
        scan.close();
        int oriNum, rem, res = 0;
        oriNum = number;
        while(oriNum!=0)
        {
            rem = oriNum % 10;
            res += Math.pow(rem, 3);
            oriNum /= 10;

        }
        if(res == number)
            System.out.println(number + " Is An Armstrong Number");
        else
            System.out.println(number + " Is Not An Armstrong Number");
    }
}
