package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.*;

public class main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Lampros", "Alexandris");
        User user = new User(1, "Costas", "Mask", "cmask", "12345", true);
        Customer customer = new Customer(1, "Adrew", "Dimitriou", "076321097", "6982005201", "West Attica", "Attica","Athens", "pattision", "76", "10432");
        Point point = new Point(0, 10);
        Order order = new Order(1, 5.5, "Meat", "Ordered");

        System.out.println("Teacher full name: " + teacher.getFirstname() + ", " + teacher.getLastname());
        System.out.println("User username: " + user.getUsername());
        System.out.println("Customer Vat" + customer.getVatRegistration());
        System.out.println("Order formatted Timestamp" + order.getFormattedTimestamp());
        System.out.printf("Point: {%d, %d}\n", point.getX(), point.getY());
    }
}
