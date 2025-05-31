package day10_if_statements;

import java.util.Scanner;

/*

     Declare and assign a number (day)

         1 - Monday
         2 - Tuesday

         6 - Saturday
         7 - Sunday

         Ex: 2
             Tuesday



  */
public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Please, enter a number between 1 - 7 (inclusive): ");
        int weekDayInNumberFromUser = key.nextInt(); //

        // Below we have 7 SINGLE IF Statements
        if (weekDayInNumberFromUser == 1) {
            System.out.println("Monday");
        }

        if (weekDayInNumberFromUser == 2) {
            System.out.println("Tuesday");
        }

        if (weekDayInNumberFromUser == 3) {
            System.out.println("Wednesday");
        }

        if (weekDayInNumberFromUser == 4) {
            System.out.println("Thursday");
        }

        if (weekDayInNumberFromUser == 5) {
            System.out.println("Friday");
        }

        if (weekDayInNumberFromUser == 6) {
            System.out.println("Saturday");
        }

        if (weekDayInNumberFromUser == 7) {
            System.out.println("Sunday");
        }

        if (weekDayInNumberFromUser < 1 || weekDayInNumberFromUser > 7) {
            System.out.println("Invalid number. There is no Weekday for " + weekDayInNumberFromUser + ". Weekdays are between 1 - 7");
        }


        System.out.println("---------------------------------------------------------");

        if (weekDayInNumberFromUser == 1) {
            System.out.println("Monday");
        } else if (weekDayInNumberFromUser == 2) {
            System.out.println("Tuesday");
        } else if (weekDayInNumberFromUser == 3) {
            System.out.println("Wednesday");
        } else if (weekDayInNumberFromUser == 4) {
            System.out.println("Thursday");
        } else if (weekDayInNumberFromUser == 5) {
            System.out.println("Friday");
        } else if (weekDayInNumberFromUser == 6) {
            System.out.println("Saturday");
        } else if (weekDayInNumberFromUser == 7) {
            System.out.println("Sunday");
        }  else {
            System.out.println("Invalid number. There is no Weekday for " + weekDayInNumberFromUser + ". Weekdays are between 1 - 7");
        }





        // EXTRA NOTES to explain the flow of the compiler execution
         /*
            if (color == "Green" || color  == "Yellow) {
                sout("It is green  and my favorite color.");
            } else if (color == "Blue") {
                sout ("It is sky color);
            } else { --- > all the other colors

            }
         */


        /*
            tankLevel > 90 --- > you ar good
            tankLevel > 80 --- > dont dive too deep
            tankLevel > 70 --- > you are in danger

            --------------------------------------- 90

            if tankLevel > 70 && tankLevel < 80 --- > you ar good
            if tankLevel > 80 && tankLevel < 90  --- > dont dive too deep
            if tankLevel > 90 --- > you are in danger
         */

    }

}
