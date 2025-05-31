package day06_a_arithmetic_operators;
/*
    Create a class House
    create a main method

    - For each datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3


            The $houseType is located at $address $zipcode.

 */
public class House {
    public static void main (String[] args){
        // Single house, Town house, Apartment, Penthouse, Multifamily
        String houseType = "Penthouse", address = "123 Test St, Fairfax, VA";

        // The following will give an error because, Java reads the file from top to bottom and var's not declared yet before they are being used.
        //int allRooms = numberOfBedrooms + numberOfBathrooms + numberOfKitchens;
        int numberOfBedrooms = 4;
        int numberOfBathrooms = 3;
        int numberOfKitchens = 2;
        int zipcode = 22033;


        boolean hasBasement = false;
        boolean hasAttic = false;
        boolean hasPool = true;
        boolean isForSale = true;
        boolean isParkNearBy = false;

        double costOfTheHouse = 675_000.99;
        double schoolRatings = 4.5;
        //int zipcode = 22033; // We canNOT declared SAME variable name twice in the SAME method.


        // The $houseType is located at $address $zipcode.
        System.out.println("The " + houseType + " is located at " + address + " " + zipcode + ".");

        System.out.println("This house has following info: \n\tCosts $" + costOfTheHouse + "\n\tHas attic: " + hasAttic + "\n\tHas pool: " + hasPool + "\n\tIs for sale: " + isForSale + "\n\tHas basement: " + hasBasement + "\n\tIs park newar by: " + isParkNearBy + "\n\tSchool ratings: " + schoolRatings);

        System.out.println("It has the following info for the rooms:" + "\n\tNumber of Bedrooms: " + numberOfBedrooms + "\n\tNumber of Bathrooms: " + numberOfBathrooms + "\n\tNumber of Kitchens: " + numberOfKitchens);


        System.out.println("--------------------------------------------------------------------------");
        String houseInfo1 = "The " + houseType + " is located at " + address + " " + zipcode + ".";
        String houseInfo2 = "This house has following info: \n\tCosts $" + costOfTheHouse + "\n\tHas attic: " + hasAttic + "\n\tHas pool: " + hasPool + "\n\tIs for sale: " + isForSale + "\n\tHas basement: " + hasBasement + "\n\tIs park newar by: " + isParkNearBy + "\n\tSchool ratings: " + schoolRatings;
        String houseInfo3 = "It has the following info for the rooms:" + "\n\tNumber of Bedrooms: " + numberOfBedrooms + "\n\tNumber of Bathrooms: " + numberOfBathrooms + "\n\tNumber of Kitchens: " + numberOfKitchens;

        System.out.println(houseInfo1 + "\n" +houseInfo2 + "\n" +houseInfo3);


        System.out.println("--------------------------------------------------------------------------");
        String allInfo = "The " + houseType + " is located at " + address + " " + zipcode + "."
                + "\nThis house has following info: \n\tCosts $" + costOfTheHouse + "\n\tHas attic: " + hasAttic + "\n\tHas pool: " + hasPool + "\n\tIs for sale: " + isForSale + "\n\tHas basement: " + hasBasement + "\n\tIs park newar by: " + isParkNearBy + "\n\tSchool ratings: " + schoolRatings
                + "\nIt has the following info for the rooms:" + "\n\tNumber of Bedrooms: " + numberOfBedrooms + "\n\tNumber of Bathrooms: " + numberOfBathrooms + "\n\tNumber of Kitchens: " + numberOfKitchens;
        System.out.println(allInfo);

        System.out.println("--------------------------------------------------------------------------");
        String allInfo2 = houseInfo1 + "\n" +houseInfo2 + "\n" +houseInfo3;
        System.out.println(allInfo2);



    }
}
