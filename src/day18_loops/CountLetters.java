package day18_loops;

public class CountLetters {
    public static void main(String[] args) {

        String str = "aabbcaa";
        char letter = 'c';
        int counter = 0;


        char newChar ;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == letter) {
                counter++;
            }


        }
        System.out.println("You have " + counter + " letter " + letter);
    }
}
