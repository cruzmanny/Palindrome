package palindrome;

public class Palindrome {
    public static StringBuilder reverse(String userInput){
        StringBuilder reversedString = new StringBuilder(String.valueOf(userInput));
        reversedString.reverse();
        return reversedString;
    }
    public static void isPalindrome(String userEntry, String reversedEntry){
        boolean b = true;
        userEntry = userEntry.replaceAll("\\s | \\-", "");
        reversedEntry = reversedEntry.replaceAll("\\s | \\-", "");
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