package homework_week_8;

/** A java program to generate the following pattern using the nested for loops:
 *
 * *
 * * *
 * * * *
 * * * * *
 */
public class Program_15_LeftTriangleStarPattern {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
