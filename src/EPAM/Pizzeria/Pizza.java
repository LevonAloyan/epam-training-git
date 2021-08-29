package EPAM.Pizzeria;

public class Pizza {

    PizzaHelper ph = new PizzaHelper();

    private String name;
    private final int orderNumber;
    private double price;
    private int numberOfIngredients;
    private Customer customer;
    private int quantity;
    private boolean tomatoPaste;
    private boolean cheese;
    private boolean salami;
    private boolean bacon;
    private boolean garlic;
    private boolean corn;
    private boolean pepperoni;
    private boolean olives;
    private boolean calzone;


    public Pizza(boolean tomatoPaste, boolean cheese, boolean salami, boolean bacon, boolean garlic, boolean corn, boolean pepperoni, boolean olives, boolean calzone) {
        this.orderNumber = ph.genOrderNumber();
        this.tomatoPaste = tomatoPaste;
        this.cheese = cheese;
        this.salami = salami;
        this.bacon = bacon;
        this.garlic = garlic;
        this.corn = corn;
        this.pepperoni = pepperoni;
        this.olives = olives;
        this.calzone = calzone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean hasTomatoPaste() {
        return tomatoPaste;
    }

    public void setTomatoPaste(boolean tomatoPaste) {
        this.tomatoPaste = tomatoPaste;
    }

    public boolean hasCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean hasSalami() {
        return salami;
    }

    public void setSalami(boolean salami) {
        this.salami = salami;
    }

    public boolean hasBacon() {
        return bacon;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public boolean hasGarlic() {
        return garlic;
    }

    public void setGarlic(boolean garlic) {
        this.garlic = garlic;
    }

    public boolean hasCorn() {
        return corn;
    }

    public void setCorn(boolean corn) {
        this.corn = corn;
    }

    public boolean hasPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    public boolean hasOlives() {
        return olives;
    }

    public void setOlives(boolean olives) {
        this.olives = olives;
    }

    public boolean isCalzone() {
        return calzone;
    }

    public void setCalzone(boolean calzone) {
        this.calzone = calzone;
    }

    public int getNumberOfIngredients() {
        return numberOfIngredients;
    }

    public void setNumberOfIngredients(int numberOfIngredients) {
        this.numberOfIngredients = numberOfIngredients;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return orderNumber + " : " + customer.getId() + " : " + name + " : " + quantity;
    }
}
