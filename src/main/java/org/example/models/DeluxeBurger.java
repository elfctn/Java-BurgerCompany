package org.example.models;

public class DeluxeBurger extends Hamburger {
    private final String cips;
    private final String drink;

    public DeluxeBurger() {
        super("Deluxe", "Double", 15.1, "Double Sandwich"); // ✅ MEAT ve BREADROLLTYPE düzeltildi
        this.cips = "CURVY";
        this.drink = "COKE";

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
