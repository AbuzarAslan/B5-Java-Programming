package day16_string;

import java.util.Scanner;

/*
    [Middle char]
    Given a String, write a program to display the middle character of a string
    a) If the length of the string is even there will be two middle characters.
    b) If the length of the string is odd there will be one middle character.
        Ex:
            Input: elephant -- > 8
            //     01234567
            Output: The middle characters: ph


        Ex:
            Input: cat -- > 3
            //     012
            Output: The middle characters: a
 */
public class MiddleChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter string: ");

        String userInput = scan.nextLine();
        String middle = "";


        if ( userInput.length() % 2 == 0) {
            // 18 / 2 = 9
            //1) this first one is substring method second is with Char
            //middle =  userInput.substring(userInput.length()/2-1, userInput.length()/2 + 1); // another option with .substring()

            //2.) char method
            middle = "" + userInput.charAt(userInput.length()/2-1) + userInput.charAt(userInput.length()/2);

        } else {
            // 7 / 2 = 3
            // 0123456

            //1.) substring
            // middle = userInput.substring(userInput.length()/2, userInput.length()/2+1 );  // another option with .substring()

            //2.) char method
            middle = "" + userInput.charAt( userInput.length()/2 );

        }

        System.out.println("Middle is: " + middle);



    }
}