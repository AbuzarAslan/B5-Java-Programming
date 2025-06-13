package day09_a_scanner;

import java.util.Scanner;

/*
    create Scanner object
    ask the user to enter 3 numbers
    find and print the sum of the numbers

    later divide your total into 2

    Hey now use the divided version and add 2
 */
public class AddNumbers {
    public static void main(String[] args) {

        // Created Scanner object and assigned it into keyboard object reference
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Please, enter 3 numbers: ");
        System.out.print("\tNumber 1: ");
        int num1 = keyboard.nextInt();

        System.out.print("\tNumber 2: ");
        int num2 = keyboard.nextInt();

        System.out.print("\tNumber 3: ");
        int num3 = keyboard.nextInt();


        int sumOfAll = num1 + num2 + num3;
        System.out.println("Sum of numbers: " + sumOfAll);


        int halOfTotal = sumOfAll / 2;
        //System.out.println("Half of the total: " + sumOfAll / 2);
        System.out.println("Half of the total: " + halOfTotal);

        //int afterAdd2 = halOfTotal;
        //afterAdd2 += 2;
        System.out.println("After adding 2: " + (halOfTotal + 2));


    }
}
