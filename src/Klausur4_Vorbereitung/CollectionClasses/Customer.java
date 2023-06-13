package Klausur4_Vorbereitung.CollectionClasses;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }
    public void addOrder(Order order) {
        this.orders.add(order);
    }
    public void printOrders() {
        System.out.println("Orders for customer " + this.name + ":");
        for (Order order : this.orders) {
            System.out.println(order);
        }
    }
}
