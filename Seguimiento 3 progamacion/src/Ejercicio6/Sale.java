package Ejercicio6;

import java.util.Date;

public class Sale {
    private Date date;
    private Shoe shoe;
    private int size;
    private int quantity;
    private double value;


    public Sale(Date date, Shoe shoe, int size, int quantity) {
        this.date = date;
        this.shoe = shoe;
        this.size = size;
        this.quantity = quantity;
        this.value = calculateTotal();
    }


    public double calculateTotal() {
        return shoe.getPrice() * quantity;
    }


    public void printDetails() {
        System.out.println("Date: " + date);
        System.out.println("Shoe: " + shoe.getName());
        System.out.println("Size: " + size);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Value: $" + value);
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Shoe getShoe() {
        return shoe;
    }

    public void setShoe(Shoe shoe) {
        this.shoe = shoe;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}

