package homework_week_8;
/**
 * A Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel or Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

import java.util.Scanner;

public class Program_3_CheckVowelOrConsonant {
    public static void main(String[] args) {
        int i = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter A Character : ");
        char c = scan.next().charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println("The Entered Character Is A Vowel");
        } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println("The Entered Character Is A Consonant");
        }
        else {
            System.out.println("The Entered Character Is NOT An Alphabet");
        }
        scan.close();

    }
}
