package main;

import inventory.Inventory;
import inventory.Product;
import inventory.Warehouse;
public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Apple", 4.00);
        Inventory inventory = new Inventory(product, 200);
        Warehouse warehouse = new Warehouse(1, "Warehouse Fruits", "Balanced");

        System.out.println("Product id: " + product.getProductId());
        System.out.println("Product name: " + product.getProductName());
        System.out.println("Product price: " + product.getPrice());

        System.out.println("Inventory product: " + inventory.getProduct().getProductName());
        System.out.println("Inventory quantity: " + inventory.getQuantity());

        System.out.println("Warehouse name: " + warehouse.getWarehouseName());
        System.out.println("Warehouse inventories: " + warehouse.getInventories());
        System.out.println("Warehouse id: " + warehouse.getWarehouseId());

    }
}