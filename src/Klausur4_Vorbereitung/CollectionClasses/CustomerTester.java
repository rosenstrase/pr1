package Klausur4_Vorbereitung.CollectionClasses;

public class CustomerTester {
    public static void main(String[] args) {
        Customer customer = new Customer("Neil Porter");
        Order order1 = new Order("PS5", 499.00);
        Order order2 = new Order("CowboyBoots", 199.00);

        customer.addOrder(order1);
        customer.addOrder(order2);

        customer.printOrders();
    }
}
