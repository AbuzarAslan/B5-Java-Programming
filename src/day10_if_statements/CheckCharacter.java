package day10_if_statements;

/*
    Create a char variable with a letter (can only do this one hardcoded, no Scanner method for char)
    find out if the letter is an uppercase letter or lowercase letter. Print the type of letter it is

    ex:
        'b'
        lowercase

    ex:
        'U'
        uppercase
 */
public class CheckCharacter {
    // main method
    public static void main (String[] args){
        // dataType varName;
        char letter = 'U';

        //System.out.println(letter + 12);
        //System.out.println(letter > 10);

        //  65 <= letter <= 90
        // SINGLE IF STATEMENT - Compiler will check every SINGLE IF Statement condition ONE by ONE
        // SINGLE IF STATEMENT - if CONDITION is TRUE, Code Block will be executed. If it is FALSE, Code Block will be skipped.
        if (65 <= letter && letter <= 90) {
            System.out.println("UPPERCASE");
        }

        // SINGLE IF STATEMENT - if CONDITION is TRUE, Code Block will be executed. If it is FALSE, Code Block will be skipped.
        if (97 <= letter && letter <= 122) {
            System.out.println("lowercase");
        }

    }
}
