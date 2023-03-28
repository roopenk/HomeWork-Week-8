package homework_week_8;
/**  Write a program in Java to display the pattern like a triangle with a number.
 For e.g.
 Input number of rows: 10
 Expected Output:
 1
 12
 123
 1234
 12345
 123456
 1234567
 12345678
 123456789
 12345678910
 */
import java.util.Scanner;

public class Program_6_PatternTriangleNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Number Of Rows You Want In The Pattern : ");
        int rows = scan.nextInt();
        scan.close();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}