package decorator;

import java.util.List;

public class CoconutJellyAddOn implements IBeverage {
    private IBeverage beverage;

    public CoconutJellyAddOn(IBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + 1.0;
    }

    @Override
    public String getName() {
        return "Coconut Jelly Add-On";
    }

    @Override
    public List<String> getCompositions() {
        List<String> compositions = this.beverage.getCompositions();
        compositions.add(this.getName());
        return compositions;
    }
}
