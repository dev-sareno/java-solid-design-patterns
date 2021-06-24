package decorator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IBeverage coffeeMilkTea = new CoffeeMilkTea();
        // Add Pearls add-on
        IBeverage pearlsAddOn = new PearlsAddOn(coffeeMilkTea);
        // Add Pudding add-on
        IBeverage puddingAddOn = new PuddingAddOn(pearlsAddOn);
        // Add Coconut Jelly add-on
        IBeverage coconutJellyAddOn1 = new CoconutJellyAddOn(puddingAddOn);
        // Add Coconut Jelly add-on
        IBeverage coconutJellyAddOn2 = new CoconutJellyAddOn(coconutJellyAddOn1);

        List<String> compositions = coconutJellyAddOn2.getCompositions();
        StringBuilder builder = new StringBuilder();
        for (String i: compositions) {
            if (builder.length() > 1){
                builder.append(", ");
            }
            builder.append(i);
        }

        System.out.println("Total: " + coconutJellyAddOn2.getCost() + ", Composition: " + builder);
    }
}
