package EPAM.Pizzeria;


import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> customerIds = new ArrayList<>();

    public static void main(String[] args) {
        Customer customer = new Customer("Aregism");
        Pizza p = customer.orderPizza();
        System.out.println(p);
    }
}
