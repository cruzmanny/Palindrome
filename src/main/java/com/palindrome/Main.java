package com.palindrome;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.print("Please enter a word, sentence, or phrase: ");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        while(userInput.isBlank()){
            System.out.println("Nothing was entered. Please try again.");
            System.out.print("Please enter a word, sentence, or phrase: ");
            userInput = input.nextLine();
        }
        input.close();
        Palindrome.output(userInput);
    }
}