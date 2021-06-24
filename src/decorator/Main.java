package decorator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IBeverage beverage = new CoffeeMilkTea();
        // Add Pearls add-on
        beverage = new PearlsAddOn(beverage);
        // Add Pudding add-on
        beverage = new PuddingAddOn(beverage);
        // Add Coconut Jelly add-on
        beverage = new CoconutJellyAddOn(beverage);
        // Add Coconut Jelly add-on
        beverage = new CoconutJellyAddOn(beverage);

        List<String> compositions = beverage.getCompositions();
        StringBuilder builder = new StringBuilder();
        for (String i: compositions) {
            if (builder.length() > 1){
                builder.append(", ");
            }
            builder.append(i);
        }

        System.out.println("Total: " + beverage.getCost() + ", Composition: " + builder);
    }
}
