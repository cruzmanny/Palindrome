/**
 * @author Manny Cruz
 * @since 14-06-2023
 * @version 1.0.1
 * The Palindrome program receives input from a user, reverses the order, and then compares the strings to check if it is a palindrome.
 * The program will accept words, numbers, phrases and sentences with white spaces, and commonly used special characters.
 * It will not accept null, blank, or an empty string.
 */
package palindrome;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.print("Please enter a word, sentence, or phrase: ");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        while(sentence.isBlank()){
            System.out.println("Nothing was entered. Please try again.");
            System.out.print("Please enter a word, sentence, or phrase: ");
            sentence = input.nextLine();
        }
        input.close();
        String reversed = String.valueOf(Palindrome.reverse(sentence));
        Palindrome.isPalindrome(sentence, reversed);
    }
}