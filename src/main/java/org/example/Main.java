package org.example;

import org.example.models.DeluxeBurger;
import org.example.models.Hamburger;
import org.example.models.HealthyBurger;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Hamburger örneği
        Hamburger hamburger = new Hamburger("Basic", "Normal", 3.56, "Wrap");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Name: " + hamburger.getName());
        System.out.println("Meat: " + hamburger.getMeat());
        System.out.println("BreadRollType: " + hamburger.getBreadRollType());
        System.out.println("Addition1: Tomato");
        System.out.println("Addition2: Lettuce");
        System.out.println("Addition3: Cheese");
        System.out.println("Price: " + String.format(Locale.ENGLISH, "%.2f", hamburger.itemizeHamburger()));
        System.out.println();

        // HealthyBurger örneği
        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 5.67, "Sandwich");
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Name: " + healthyBurger.getName());
        System.out.println("Meat: " + healthyBurger.getMeat());
        System.out.println("BreadRollType: " + healthyBurger.getBreadRollType());
        System.out.println("Addition1: Egg");
        System.out.println("HealthyAddition1: Lentils");
        System.out.println("Price: " + String.format(Locale.ENGLISH, "%.2f", healthyBurger.itemizeHamburger()));
        System.out.println();

        // DeluxeBurger örneği
        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Name: " + db.getName());
        System.out.println("Meat: " + db.getMeat());
        System.out.println("BreadRollType: " + db.getBreadRollType());
        System.out.println("Price: " + String.format(Locale.ENGLISH, "%.2f", db.itemizeHamburger()));
    }
}
