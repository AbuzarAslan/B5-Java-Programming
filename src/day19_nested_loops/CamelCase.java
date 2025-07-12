package day19_nested_loops;

import java.util.Scanner;

/*
Camel Case

            Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

            Ex:

                Today is SUNDAY

                Output:

                todayIsSunday

 */
public class CamelCase {
    public static void main(String[] args) {

//        String word = "Today is SUNDAY";
//        String newWord = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter multiple words in sentence : ");
        String sentence = input.nextLine().trim();

        String camelCase = "";


        for (int i = 0; i < sentence.length(); i++) {

            if(sentence.charAt(i) == ' ') {// burda sen char dedin ve sonra " " eledin ama olmaz o stringdir ona gore
                // ' '
                // olacaq

                camelCase += ("" + sentence.charAt(i+1)).toUpperCase();
                i++;
                 // burda bunu mutleq yaziriqki space ' " tapan kimi ustune bir gelsin ve orada hem i ni tapib
                // Upper edib sonra yeniden i gelmesin. today is sunday todayIis kimi olur ona gore

            } else {
                camelCase += sentence.charAt(i); // bunu yuxarida yox burda ona gore edirik ki bu loop her defe
                // firlananda baxirki space deyil ve onda charlari yan yana yaradir ve sen ona UpperCase order
                // verdiyin ucun artiq uppercase edecek

            }


        }
        System.out.println(camelCase);


    }
}
