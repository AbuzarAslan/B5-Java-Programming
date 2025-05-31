package day12_switch_statements;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What day of the week is it today? ");
        String day = keyboard.next();

        // RULE 1 - the exactValues canNOT be DUPLICATE / cases cannot be duplicate
        // RULE 2 - For switch we canNOT compare with relational operators (>, <, <=, >=, [==], !=)
        // RULE 3 - String, char, int, short, byte
        // RULE 4 - After 1st matching case Execution goes until the 1st break reached

        switch (day) {
            case "Monday", "Mon", "monday", "mon", "1":
                System.out.println("We have Mentor Sessions on Mondays");
                break;
            case "Tuesday", "2":
            case "Friday", "5":
                System.out.println("We have no classes!");
                break;
            case "Wednesday":
            case "Thursday":
            case "Saturday":
                System.out.println("We have Java classes!");
                break;
            case "Sunday":
                System.out.println("We have Soft skill classes!");
                break;
            default:
                System.out.println("Not valid date!");

        }

        /*
            // With if statements we would have to write multiple OR conditions
            // NOTE:  DO NOT EVER COMPARE String values with == (equal operator)
            if (day == "Monday" || day == "Tuesday" || day == "Wednesday" || day == "Thursday" || day == "Friday") {
                System.out.println("We have Java classes!");
            }
         */




    }
}
