package day07_relational_operators;

/*
     Task:
        Declare and assign a number

        I want to know the sign of the number
            if the number positive
            is the number negative
            is the number 0
 */
public class SignType {
    public static void main(String[] args) {

        int num = -56;

        boolean isPositive = num > 0;
        boolean isNegative = num < 0;
        boolean isZero = num == 0;

        System.out.println("Num is positive: " + isPositive); // true
        System.out.println("Num is negative: " + isNegative); // false
        System.out.println("Num is zero: " + isZero); // false
    }
}