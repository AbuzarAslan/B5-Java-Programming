package day10_if_statements;

public class IfElseExample {
    public static void main(String[] args) {
        int examResult = 60;

        // if you result more than or equal to 75, you pass. OTHERWISE you fail
        if (examResult >= 75){
            System.out.println("Pass");
        }

        if (examResult < 75){
            System.out.println("Fail");
        }


        System.out.println("----------------------");
        int score = 60;
        // if you result more than or equal to 75, you pass. OTHERWISE you fail
        if (score >= 75){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }


    }
}