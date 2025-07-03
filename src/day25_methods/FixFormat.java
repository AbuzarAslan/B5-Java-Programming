package day25_methods;
/*
    Fix Format

    create a method will accept a String and return a String in proper format.
    Proper format is:
        First character starting as uppercase and the rest as lowercase

    Ex:
    Input:
        jamES

    Output:
        James

 */
public class FixFormat {

    // TODO: Homework - handle the case where this method does not accept more than one word
    // If more than one word - return a message: "Should be single word"
    public static String fixFormat (String str) {
        String fixed = "";

        /*
            first char to uppercase
            rest is lowercase
         */

        fixed = (""+str.charAt(0)).toUpperCase() + str.substring(1).toLowerCase();


        return fixed;
    }

    public static void main(String[] args) {
        System.out.println( fixFormat("TOM") ); // Tom
        System.out.println(  fixFormat("HaNNA") );
        System.out.println(  fixFormat("HaNNA Jama") );
    }
}