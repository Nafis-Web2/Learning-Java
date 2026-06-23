package car;
import person.*;

public class Car {
    String make;
    String owner;

    public static void main(String[] args) {
        Person person = new Person();
        Car car = new Car();

        person.name = "Nafis";
        car.make = "Honda";

        car.owner = person.name;

        System.out.println("The care make is: " + car.make + " and the owner of the make is " + car.owner);

    }
    
}
