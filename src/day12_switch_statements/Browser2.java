package day12_switch_statements;

import java.util.Scanner;

public class Browser2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please, enter your browser name: ");
        String browser = keyboard.nextLine(); // for multiple words

        System.out.print("Which webpage (URL) you want to navigate to: ");
        String webPageUrl = keyboard.next();


        // Opening $webPageUrl in $browser

        // RULE 1 - the exactValues canNOT be DUPLICATE / cases cannot be duplicate
        // RULE 2 - For switch we canNOT compare with relational operators (>, <, <=, >=, [==], !=)
        // RULE 3 - String, char, int, short, byte
        // RULE 4 - After 1st matching case Execution goes until the 1st break reached


        switch (browser) {
            case "Chrome":   //or case "Chrome", "chrome"
            case "chrome":
                System.out.println("Opening " + webPageUrl + " in Chrome");
                break;
            case "Safari":
            case "safari":
                System.out.println("Opening " + webPageUrl + " in Safari");
                break;
            case "Firefox":
                System.out.println("Opening " + webPageUrl + " in Firefox");
                break;
            case "Internet Explorer":
                System.out.println("Opening " + webPageUrl + " in Internet Explorer");
                break;
            case "Opera":
                System.out.println("Opening " + webPageUrl + " in Opera");
                break;
        }

    }

}