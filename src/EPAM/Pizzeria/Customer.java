package EPAM.Pizzeria;

import java.util.ArrayList;

public class Customer {
    CustomerHelper ch = new CustomerHelper();
    private int id;
    private String name;
    private int pizzasOrdered = 0;
    private ArrayList<Pizza> pizzas = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
        this.id = ch.generateId();
    }

    public Pizza orderPizza() {
        if (!ch.checkAvailability(this)) {
            System.out.println("Sorry " + name + " you can't have anymore pizza :(");
            return null;
        }

        System.out.println("You can choose up to 7 additions to your pizza! Here's the list and prices:\n" +
                "Tomato paste ($1), Cheese ($1), Salami ($1.5), Bacon ($1,2), Garlic ($0.3), Corn ($0.7), Pepperoni ($0.6), Olives ($0.5)");


        double currentPizzaPrice = 1;
        int ingredientCounter = 0;
        boolean tomatoPaste = ch.getYesOrNo("Add Tomato Paste?");
        if (tomatoPaste) {
            ingredientCounter++;
            currentPizzaPrice += 1;
        }
        boolean cheese = ch.getYesOrNo("Add cheese?");
        if (cheese) {
            ingredientCounter++;
            currentPizzaPrice += 1;
        }
        boolean salami = ch.getYesOrNo("Add Salami?");
        if (salami) {
            ingredientCounter++;
            currentPizzaPrice += 1.5;
        }
        boolean bacon = ch.getYesOrNo("Add Bacon?");
        if (bacon) {
            ingredientCounter++;
            currentPizzaPrice += 1.2;
        }
        boolean garlic = ch.getYesOrNo("Add Garlic?");
        if (garlic) {
            ingredientCounter++;
            currentPizzaPrice += 0.3;
        }
        boolean corn = ch.getYesOrNo("Add Corn?");
        if (corn) {
            ingredientCounter++;
            currentPizzaPrice += 0.7;
        }
        boolean pepperoni = ch.getYesOrNo("Add pepperoni?");
        if (pepperoni) {
            ingredientCounter++;
            currentPizzaPrice += 0.6;
        }
        boolean olives = false;
        if (ingredientCounter < 7) {
            System.out.println("Whoops! Too many ingredients!");
            olives = ch.getYesOrNo("Add Olives?");
            if (olives) {
                ingredientCounter++;
                currentPizzaPrice += 0.5;
            }
        }

        boolean calzone = ch.getYesOrNo("Do you want this pizza made calzone?");
        if (calzone) {
            currentPizzaPrice += 0.5;
        }

        int quantity = ch.getOrderCount();

        if (quantity + pizzasOrdered > 10) {
            return null;
        }
        pizzasOrdered += quantity;


        Pizza pizza = new Pizza(tomatoPaste, cheese, salami, bacon, garlic, corn, pepperoni, olives, calzone);
        pizza.setCustomer(this);
        pizza.setName(ch.getPizzaName(this));
        pizza.setQuantity(quantity);
        pizza.setPrice(currentPizzaPrice);
        pizza.setNumberOfIngredients(ingredientCounter);
        while (quantity > 0) {
            pizzas.add(pizza);
            quantity--;
        }
        return pizza;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPizzasOrdered() {
        return pizzasOrdered;
    }

    public void setPizzasOrdered(int pizzasOrdered) {
        this.pizzasOrdered = pizzasOrdered;
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
