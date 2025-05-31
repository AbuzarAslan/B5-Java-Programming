package day12_switch_statements;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int correctPin = 2222;
        double balance = 100_000.00;

        System.out.print("WELCOME TO ATM\n\tPlease, insert your card.\n\tPlease, enter you pin: ");
        int userInputVar = keyboard.nextInt(); // 8768756

        // check if the pin is 4 digits
        // 4 digits number -> 1000........9999
        if (userInputVar < 1000 || userInputVar > 9999) {
            System.out.println("\n\tYou have entered either less than or more than 4 digits");

        } else {

            if (userInputVar == correctPin) {

                System.out.println("\n\tYou're logged in!");
                System.out.println("\t\tSelect one of the options below:");
                System.out.println("\t\t\t1 - Check balance");
                System.out.println("\t\t\t2 - Deposit money");
                System.out.println("\t\t\t3 - Withdraw money");
                System.out.println("\t\t\t4 - Exit");
                System.out.print("\t\t\tChoose between 1 - 4: ");
                int userChoice = keyboard.nextByte();

                //if (!(userChoice >= 1 && userChoice <= 4)) {
                if (userChoice < 1 || userChoice > 4) {
                    System.out.println("\n\tWrong choice! Valid choices are 1 - 4. Exiting the account.");
                } else {
                    if (userChoice == 1) {
                        System.out.println("\t\t\t\tYour balance is: $" + balance);
                    } else if (userChoice == 2) {
                        System.out.print("\t\t\t\tEnter the amount you want to deposit: ");
                        //double userDeposit = keyboard.nextDouble();
                        //balance = balance + userDeposit;
                        //balance += userDeposit;
                        balance += keyboard.nextDouble();
                        System.out.println("\t\t\t\tYour new balance is: $" + balance);
                    } else if (userChoice == 3) {
                        System.out.print("\t\t\t\tEnter the amount you want to withdraw: ");
                        double userWithdraw = keyboard.nextDouble();
                        if (userWithdraw > balance) {
                            System.out.println("\t\t\t\tYou don't have enough money to withdraw that amount.");
                        } else {
                            //balance = balance - userWithdraw;
                            balance -= userWithdraw;
                            System.out.println("\t\t\t\tYour new balance is: $" + balance);
                        }
                    } else {
                        System.out.println("\n\t\t\tThanks for the visit. Your moneys is in safe hands. Exiting.... Bye!");
                    }

                }

            } else {
                System.out.println("\n\tWrong pin!");
            }

        }

    }
}
