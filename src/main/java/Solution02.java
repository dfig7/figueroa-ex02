/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Diego Figueroa
 */

import java.util.Scanner;

/*
Print: What is the input string?
save string into variable 'userInput'
Print: 'userInput' has # characters
 */
public class Solution02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("What is the input string? ");
        String userInput = sc.nextLine();
        System.out.printf("%s has %d characters.", userInput, userInput.length());
    }
}
