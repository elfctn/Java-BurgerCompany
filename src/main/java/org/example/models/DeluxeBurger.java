package org.example.models;

public class DeluxeBurger extends Hamburger {
    private String cips;
    private String drink;

    public DeluxeBurger() {
        super("Deluxe", "Double Sausage", 15.1, "WHITE");
        this.cips = "CURVY";
        this.drink = "COKE";

        // Toplam 4.0 olacak şekilde eklemeler:
        super.addHamburgerAddition1("Chips", 2.0);
        super.addHamburgerAddition2("Drink", 2.0);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }
}
