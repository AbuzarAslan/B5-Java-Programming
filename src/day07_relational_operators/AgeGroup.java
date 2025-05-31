package day07_relational_operators;

/*
Task:

    declare and assign an age variable
        - is the person a kid ( up to 13, include 13)
        - is the person a senior citizen ( 65 and above)

 */
public class AgeGroup {
    public static void main(String[] args) {

        int ageOfPerson = 30; // we do not know yet.

        // Kid has to be 13 years or less
        boolean isKid = ageOfPerson <= 13;
        System.out.println("Is it a kid: " + isKid);

        boolean isSenior = ageOfPerson >= 65;
        System.out.println("Is it a senior: " + isSenior);





    }
}