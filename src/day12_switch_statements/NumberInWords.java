package day12_switch_statements;

public class NumberInWords {
    public static void main(String[] args) {
        int num = 99;


        // Option 1 - MULTI BRANCH IF / ELSE-IF - Control Flow Statement
        if (num == 0) {
            System.out.println("Zero");
        } else if (num == 1) {
            System.out.println("One");
        } else if (num == 2) {
            System.out.println("Two");
        } else if (num == 3) {
            System.out.println("Three");
        } else if (num == 4) {
            System.out.println("Four");
        } else if (num == 5) {
            System.out.println("Five");
        } else if (num == 6) {
            System.out.println("Six");
        } else if (num == 7) {
            System.out.println("Seven");
        } else if (num == 8) {
            System.out.println("Eight");
        } else if (num == 9) {
            System.out.println("Nine");
        } else {
            System.out.println("All the other numbers which are not 0-9");
        }


        System.out.println("-------------");
        // Option 2 - SWITCH STATEMENT - Control Flow Statement
        // RULE 1 - the exactValues canNOT be DUPLICATE / cases cannot be duplicate
        // RULE 2 - For switch we canNOT compare with relational operators (>, <, <=, >=, [==], !=)
        // RULE 3 - String, char, int, short, byte

        switch (num) { // 5
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default: // else part
                System.out.println("All the other numbers which are not 0-9");
        }

    }
}
