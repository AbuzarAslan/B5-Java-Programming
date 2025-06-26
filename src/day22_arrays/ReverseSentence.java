package day22_arrays;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {

        String sentence = "today is monday";
        String reversedSentence = "";

        String [] sentenceInArr = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceInArr));

        for (int i = sentenceInArr.length-1; i >= 0; i--) {
           // System.out.println(sentenceInArr[i]);
            reversedSentence += sentenceInArr[i] + " ";  // we do space here to put space between words
            // however it will put space at the end of the last word also, we handle it in print statement


        }

        System.out.println("Original sentence: " + sentence);
        System.out.println("Reversed sentence: " + reversedSentence.trim()); // we handle space with trim here

    }
}
