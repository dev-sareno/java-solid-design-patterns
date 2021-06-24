package decorator;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMilkTea implements IBeverage {
    @Override
    public double getCost() {
        return 5.0;
    }

    @Override
    public String getName() {
        return "Coffee Milk Tea";
    }

    @Override
    public List<String> getCompositions() {
        List<String> compositions = new ArrayList<>();
        compositions.add(this.getName());
        return compositions;
    }
}
