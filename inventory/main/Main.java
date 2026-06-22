package inventory.main;
import inventory.Inventory;
import inventory.Product;
import inventory.Warehouse;

public class Main {
    public static void main(String[] args) {
        // Create a product
        Product product1 = new Product();
        product1.productId = 101;
        product1.productName = "Laptop";
        product1.price = 999.99;

        // Create a warehouse
        Warehouse warehouse1 = new Warehouse();
        warehouse1.warehouseName = "Main Warehouse";

        // Create an inventory record
        Inventory inventory1 = new Inventory();
        inventory1.product = product1;
        inventory1.quantity = 50;

        // Display the information
        System.out.println("Product ID: " + inventory1.product.productId);
        System.out.println("Product Name: " + inventory1.product.productName);
        System.out.println("Price: $" + inventory1.product.price);
        System.out.println("Warehouse Name: " + warehouse1.warehouseName);
        System.out.println("Quantity in Inventory: " + inventory1.quantity);
    }
}
