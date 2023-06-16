/**
 * @author Manny Cruz
 * @since 14-06-2023
 * @version 1.0.1
 * The Palindrome program receives input from a user, reverses the order, and then compares the strings to check if it is a palindrome.
 * The program will accept words, numbers, phrases and sentences with white spaces, and commonly used special characters.
 * It will not accept null, blank, or an empty string.
 */
package palindrome;
public class Palindrome {
    /**
     * Returns the word, sentence, or phrase entered in reversed order. Entries can not be null.
     * @param userInput the word, sentence or phrase entered
     * @return The user's input in reversed order
     */
    public static StringBuilder reverse(String userInput){
        StringBuilder reversedString = new StringBuilder(String.valueOf(userInput));
        reversedString.reverse();
        return reversedString;
    }
    /**\
     * Checks if the entry is a palindrome by comparing the string entered with the string in reverse.
     * Removes any white spaces and commonly used special characters before the comparison.
     * If a match is detected it will output a success message else, a mismatch message.
     * @param userEntry the entry string made by the user
     * @param reversedEntry the entry string in reverse order
     */
    public static void isPalindrome(String userEntry, String reversedEntry){
        String regex = "[\\s\"',;.:?!-]";
        userEntry = userEntry.replaceAll(regex, "");
        reversedEntry = reversedEntry.replaceAll(regex, "");
        String output = "You have entered: " + userEntry + "\nYour entry reversed: " + reversedEntry;
        if (userEntry.equals(reversedEntry)){
            System.out.print(output + "\nYou have entered a palindrome :)");
        }
        else {
            System.out.print(output + "\nYou did not enter a palindrome :(");
        }
    }
}