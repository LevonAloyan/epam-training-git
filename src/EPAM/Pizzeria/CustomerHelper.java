package EPAM.Pizzeria;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class CustomerHelper {

    boolean checkAvailability(Customer customer) {
        return customer.getPizzas().size() < 10;
    }

    String getPizzaName(Customer customer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name your pizza! (4-20 characters)");
        String name = scanner.next();
        boolean valid = name.matches("\\w+");
        if (name.length() < 4 || name.length() > 20 || !valid) {
            name = "";
            return name + customer.getId() + customer.getPizzas().size();
        }
        return name;
    }

    boolean getYesOrNo(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        System.out.println("Please type 'Y' or 'y' to confirm and anything else to decline.");
        String yes = "y";
        return scanner.nextLine().equalsIgnoreCase(yes);
    }

    int getOrderCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many of these would you like?");
        int number;
        while (true) {
            try {
                number = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("wrong input!");

            }
        }
        return number;
    }

    int generateId() {
        Random r = new Random();
        int result;
        do {
            result = r.nextInt(8999) + 1000;
        } while (Main.customerIds.contains(result));
        return result;
    }
}
