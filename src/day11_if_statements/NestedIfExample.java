package day11_if_statements;

public class NestedIfExample {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = false;
        boolean c = true;
        boolean d = false;

        // If conditions are also called CONTROL FLOW STATEMENTS

        if (a) {
            System.out.println(1);

            if (b) { // NESTED IF STATEMENT
                System.out.println(2);
            }

            System.out.println("ONE");

            if (c) {
                System.out.println("THREE");
            }
        } else {

            System.out.println(4);

            if (d) {
                System.out.println("Five");
            }

        }

        System.out.println("After 1st if");


    }
}