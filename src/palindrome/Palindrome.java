package palindrome;

public class Palindrome {
    public static StringBuilder reverse(String userInput){
        StringBuilder reversedString = new StringBuilder(String.valueOf(userInput));
        reversedString.reverse();
        return reversedString;
    }
}