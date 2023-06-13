package Klausur4_Vorbereitung.CollectionClasses;

public class Order {
    private String description;
    private double price;

    public Order(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
