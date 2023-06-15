/**
 * @author Manny Cruz
 * @since 14-06-2023
 * The Palindrome program receives input from a user, reverses the order,
 * and then compares the strings to check if it is a palindrome.
 * The program will accept words, numbers, phrases and sentences with white spaces, or hyphenated words.
 * It will not accept null, blank, or an empty string.
 */
package palindrome;
import java.util.regex.*;
public class Palindrome {
    /**
     * Returns the word, sentence, or phrase entered in reversed order.
     * Entry can not be null.
     * @param userInput the word, sentence or phrase entered
     * @return The user's input in reversed order
     */
    public static StringBuilder reverse(String userInput){
        StringBuilder reversedString = new StringBuilder(String.valueOf(userInput));
        reversedString.reverse();
        return reversedString;
    }
    /**\
     * Checks if the entry is a palindrome by comparing each character of the string entered with the string in reverse.
     * Removes any white spaces and hyphens (will accept hyphenated words and phrases or sentences with spaces)
     * before the comparison. If a mismatch is detected it will output the string is not a palindrome else,
     * the output will show a success message.
     * @param userEntry the entry string made by the user
     * @param reversedEntry the entry string in reverse order
     */
    public static void isPalindrome(String userEntry, String reversedEntry){
        boolean b = true;
        userEntry = userEntry.replaceAll("[\\s\\-]", "");
        reversedEntry = reversedEntry.replaceAll("[\\s\\-]", "");
        for (int i = 0; i < userEntry.length(); i++){
            if (userEntry.charAt(i) == reversedEntry.charAt(i)) {
            } else{
                b = false;
                break;
            }
        }
        if (!b) {
            System.out.println("You did not enter a Palindrome :(");
        } else {
            System.out.println("You have entered a Palindrome :)");
        }
    }
}