package EPAM.Pizzeria;

public class PizzaHelper {

    int lastOrderNumber = 9999;

    int genOrderNumber() {
        if (lastOrderNumber == 99999) {
            lastOrderNumber = 9999;
        }
        return ++lastOrderNumber;
    }

}
