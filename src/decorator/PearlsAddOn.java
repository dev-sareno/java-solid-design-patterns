package decorator;

import java.util.List;

public class PearlsAddOn implements IBeverage {
    private IBeverage beverage;

    public PearlsAddOn(IBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + 2.5;
    }

    @Override
    public String getName() {
        return "Pearls Add On";
    }

    @Override
    public List<String> getCompositions() {
        List<String> compositions = this.beverage.getCompositions();
        compositions.add(this.getName());
        return compositions;
    }
}
