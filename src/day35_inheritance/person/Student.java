package day35_inheritance.person;
// Custom Class
// Student IS-A Person --> IS-A relation / Inheritance / Parent Child / Super Sub
public class Student extends Person {
    //    // Instance Var
//    String name;
//    int age;
    boolean hasSchoolUniform;
//
//    // Instance Method
//    public void talk () {
//        System.out.println(name + " is talking.");
//    }

    public void wears () {
        System.out.println(name + " is having uniform: " + hasSchoolUniform);
    }


}