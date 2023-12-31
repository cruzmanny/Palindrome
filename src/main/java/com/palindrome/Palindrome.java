package com.palindrome;
public class Palindrome {
    /**
     * Reverses the string entered by the user.
     * @param userInput String entered by the user.
     * @return Reversed string.
     */
    protected static String reverse(String userInput) {
        StringBuilder reversedString = new StringBuilder(String.valueOf(userInput));
        reversedString.reverse();
        return reversedString.toString();
    }
    /**
     * Checks if the input and reversed input is a palindrome after removing empty spaces.
     * @param userInput String entered by the user.
     * @param reversedInput Reversed string that has been passed by {@link #reverse(String)}
     * @return true or false.
     */
    protected static boolean isPalindrome(String userInput, String reversedInput) {
        userInput = userInput.replaceAll(" ", "");
        reversedInput = reversedInput.replaceAll(" ", "");
        return userInput.equals(reversedInput);
    }
    /**
     * Outputs whether the string entered is a palindrome.
     * @param userInput String entered by the user.
     */
    protected static void output(String userInput){
        String reversedInput = reverse(userInput);
        String str = "Your entry reversed: " + reversedInput;
        if(!isPalindrome(userInput, reversedInput)){
            System.out.print(str + "\nYou did not enter a palindrome :(");
        }else{
            System.out.print(str + "\nYou have entered a palindrome :)");
        }
    }
}