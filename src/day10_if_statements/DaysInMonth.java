package day10_if_statements;

import java.util.Scanner;

/*
        create an int variable to represent the month number, where 1 is January and 12 is December.
        use the month number input to determine how many days are in that month.
        use the following data to help you determine the number of days in each month:

            Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
            Months that has 30 days: 4, 6, 9, 11
            Month that has 28 days: 2

            ex:
                12
                31 days

            ex:
                9
                3

   */
public class DaysInMonth {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a month number between 1 - 12 (inclusive): ");
        int monthNumFromUser = key.nextInt();

        boolean has31Days = monthNumFromUser == 1 || monthNumFromUser == 3 || monthNumFromUser == 5 || monthNumFromUser == 7
                || monthNumFromUser == 8 || monthNumFromUser == 10 || monthNumFromUser == 12;

        boolean has30Days = monthNumFromUser == 4 || monthNumFromUser == 6 || monthNumFromUser == 9 || monthNumFromUser == 11;
        boolean has28Days = monthNumFromUser == 2;


        if (has31Days) {
            System.out.println("This month has 31 days.");
        }

        if (has30Days) {
            System.out.println("This month has 30 days.");
        }

        if (has28Days) {
            System.out.println("This month has 28 days.");
        }

        // In this if we covered all the other number user can give us other than 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
        if (!has31Days && !has30Days && !has28Days) { // if number is not 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 --- > all the other numbers
            System.out.println("Invalid number. There is no month with number of " + monthNumFromUser);
        }



        System.out.println("------------------------------------------------------------");


        if (has31Days){
            System.out.println("This month has 31 days.");
        } else if (has30Days){
            System.out.println("This month has 30 days.");
        } else if (has28Days){
            System.out.println("This month has 28 days.");
        } else { // In this if we covered all the other number user can give us other than 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
            System.out.println("Invalid number. There is no month with number of " + monthNumFromUser);
        }

    }
}

/*
    if I want to check - if something is TURE then do something other do not do anything ---- >  SINGLE IF STATEMENT
        if (condition) {
        }
    if I want to check - if something is TRUE then something, if it is FALSE then do something else ---- > IF ELSE  (or 2 single IF STATEMENTS)
        if (condition) {
        } else {
        }
    if I want to check - is condition 1 is TURE, then do something and skip rest, or if condition 2 is TRUE, then do something and skip rest, or if cond......  ---- > ELSE IF
        if (condition1) {
        } else if (condition2) {
        } else if (condition3) {
        } else if (condition4) {
        } else if (condition5) {
        } else {
        }
 */