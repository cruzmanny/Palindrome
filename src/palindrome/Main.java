/**
 * @author Manny Cruz
 * @since 14-06-2023
 * The Palindrome program receives input from a user, reverses the order,
 * and then compares the strings to check if it is a palindrome.
 * The program will accept words, numbers, phrases and sentences with white spaces, or hyphenated words.
 * It will not accept null, blank, or an empty string.
 */
package palindrome;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.print("Please Enter a Word, Sentence, or Phrase: ");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        while(sentence.isBlank()){
            System.out.println("Nothing Was Entered. Please Try Again.");
            System.out.print("Please Enter a Word, Sentence, or Phrase: ");
            sentence = input.nextLine();
        }
        System.out.printf("%s%n","You Have Entered: " + sentence);
        System.out.print("Your Entry Reversed: ");
        String reversed = String.valueOf(Palindrome.reverse(sentence));
        System.out.printf("%s%n",reversed);
        Palindrome.isPalindrome(sentence, reversed);
    }
}