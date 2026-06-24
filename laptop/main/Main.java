package laptop.main;

import laptop.Laptop;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop();

        laptop1.brand = "MacBook";
        laptop1.model = "Air";
        laptop1.price = 1200;
        laptop1.ram = 64;
        laptop1.storage = 128;

        laptop2.brand = "HP";
        laptop2.model = "Sky";
        laptop2.price = 900;
        laptop2.ram = 64;
        laptop2.storage = 128;

        System.out.println(laptop1.brand);
        System.out.println(laptop1.model);
        System.out.println(laptop1.price);
        System.out.println(laptop1.ram);
        System.out.println(laptop1.storage);
        System.out.println("");
        System.out.println(laptop2.brand);
        System.out.println(laptop2.model);
        System.out.println(laptop2.price);
        System.out.println(laptop2.ram);
        System.out.println(laptop2.storage);

    }
}
