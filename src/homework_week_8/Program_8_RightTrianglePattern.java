package homework_week_8;
/** A Java program to display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@
 */
 public class Program_8_RightTrianglePattern {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }

    }
}
