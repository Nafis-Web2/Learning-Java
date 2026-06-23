package person;

public class Person {
    public int age;
    public String name;

    public static void main(String[] args) {
        Person person = new Person();

        person.name = "Nafis";
        person.age = 25;

        System.out.println(person.name);
        System.out.println(person.age);
    }
}