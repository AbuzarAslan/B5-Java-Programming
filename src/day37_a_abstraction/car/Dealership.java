package day37_a_abstraction.car;


public class Dealership {
    public static void main(String[] args) {
        //Car car = new Car();
        //car.start();
        // Abstract Class cannot have object created from it

        Toyota toyota = new Toyota();
        toyota.start();

        Honda honda = new Honda();
        honda.start();

        Tesla tesla = new Tesla();
        tesla.start();
        tesla.charge();


        // Abstract Class cannot have object created from it
        //ElectricCar eC = new ElectricCar () {
        //eC.charge();

    }
}
