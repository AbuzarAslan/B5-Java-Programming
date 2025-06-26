package day22_arrays;

public class LetterPrinter {
    public static void main(String[] args) {
        String[] arr = {"java", "country", "code"};

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];

            for (int j = 0; j < word.length(); j++) {
                System.out.print(word.charAt(j) + " ");
            }

            System.out.println(); // move to next line after each word
        }
    }
}