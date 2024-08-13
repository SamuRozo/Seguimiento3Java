package Ejercicio4;

public class PropertyMain {

    public static void main(String[] args) {

        Property[] properties = new Property[3];


        properties[0] = new Property("P01", "123 Maple St", 120.5, 250000, 3, 2, true, "Available");
        properties[1] = new Property("P02", "456 Oak St", 95.0, 200000, 2, 1, false, "Sold");
        properties[2] = new Property("P03", "789 Pine St", 150.0, 300000, 4, 3, true, "Rented");


        for (Property property : properties) {
            property.showDetails();
        }


        properties[0].setStatus("Sold");
        properties[2].setStatus("Sold");


        System.out.println("After changing the status of the first property:");
        properties[0].showDetails();
        properties[2].showDetails();
    }


}
