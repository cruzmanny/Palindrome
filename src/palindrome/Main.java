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