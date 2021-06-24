package decorator;

import java.util.List;

public class PuddingAddOn implements IBeverage {
    private IBeverage beverage;

    public PuddingAddOn(IBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + 1.5;
    }

    @Override
    public String getName() {
        return "Pudding Add On";
    }

    @Override
    public List<String> getCompositions() {
        List<String> compositions = this.beverage.getCompositions();
        compositions.add(this.getName());
        return compositions;
    }
}
