package Ejercicio6;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Shoe[] shoes = new Shoe[5];
        shoes[0] = new Shoe("Model A", "Leather", "Black", 100, "Winter Collection");
        shoes[1] = new Shoe("Model B", "Canvas", "White", 80, "Summer Collection");
        shoes[2] = new Shoe("Model C", "Suede", "Brown", 120, "Spring Collection");
        shoes[3] = new Shoe("Model D", "Synthetic", "Blue", 90, "Fall Collection");
        shoes[4] = new Shoe("Model E", "Mesh", "Red", 85, "Sports Collection");


        Inventory[] inventories = new Inventory[5];
        inventories[0] = new Inventory(shoes[0], new int[]{40, 41, 42, 43}, new int[]{10, 8, 5, 7});
        inventories[1] = new Inventory(shoes[1], new int[]{39, 40, 41, 42}, new int[]{6, 9, 12, 4});
        inventories[2] = new Inventory(shoes[2], new int[]{42, 43, 44}, new int[]{3, 5, 8});
        inventories[3] = new Inventory(shoes[3], new int[]{41, 42, 43, 44}, new int[]{7, 6, 9, 11});
        inventories[4] = new Inventory(shoes[4], new int[]{38, 39, 40}, new int[]{5, 4, 8});


        Sale[] sales = new Sale[3];
        sales[0] = new Sale(new Date(), shoes[0], 42, 3);
        inventories[0].registerStockExit(42, 3);
        sales[1] = new Sale(new Date(), shoes[1], 40, 2);
        inventories[1].registerStockExit(40, 2);
        sales[2] = new Sale(new Date(), shoes[2], 44, 1);
        inventories[2].registerStockExit(44, 1);


        System.out.println("Current Inventory:");
        for (Inventory inventory : inventories) {
            inventory.displayInventory();
            System.out.println();
        }


        System.out.println("Sales Details:");
        for (Sale sale : sales) {
            sale.printDetails();
            System.out.println();
        }
    }
}

