package day10_if_statements;

import java.util.Scanner;

/*

    Task:
        ask the user to enter the temperature

        if the temperature is above or equal to 70 and less than 80
            print: Its a nice day
                   Go outside, but with your laptop to code java
        if the temperature is less than 70
            print: Its too cold
                   Code more java
 */
public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter the temperature: ");
        int temperature = input.nextInt();

        // above or equal to 70 and less than 80
        if (temperature >= 70 && temperature < 80) {
            System.out.println("Its a nice day");
            System.out.println("Go outside, but with your laptop to code java");
        } else {
            System.out.println("Its too cold");
            System.out.println("Code more java");
        }

//        if (temperature < 70 || temperature >= 80) {
//            System.out.println("Its too cold");
//            System.out.println("Code more java");
//        }

        /*
            if (color == "Green" || color  == "Yellow) {
                sout("It is green  and my favorite color.");
            } else { --- > all the other colors

            }
         */



    }
}
