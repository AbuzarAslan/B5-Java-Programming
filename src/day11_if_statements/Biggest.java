package day11_if_statements;

import java.util.Scanner;

/*
    declare and assign 3 int variables
    between the 3 numbers find the print the biggest one
    if all same does not matter you can print any and say that it is the biggest
 */
public class Biggest {
    public static void main(String[] args) {
        // Scanner Object Creation
        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter 3 numbers: ");
        int num1 = key.nextInt();
        int num2 = key.nextInt();
        int num3 = key.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("The biggest number is: " + num1);
        }

        if (num2 > num1 && num2 > num3) {
            System.out.println("The biggest number is: " + num2);
        }

        if (num3 > num1 && num3 > num2) {
            System.out.println("The biggest number is: " + num3);
        }

        if (num1 == num2 && num1 == num3 && num2 == num3) {
            System.out.println("All numbers are equal");
        }


        System.out.println("-------------------------------------");
        if (num1 > num2 && num1 > num3) {
            System.out.println("The biggest number is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The biggest number is: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("The biggest number is: " + num3);
        } else {
            System.out.println("All numbers are equal");
        }


        System.out.println("-------------------------------------");
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The biggest number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The biggest number is: " + num2);
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println("The biggest number is: " + num3);
        }


    }
}
