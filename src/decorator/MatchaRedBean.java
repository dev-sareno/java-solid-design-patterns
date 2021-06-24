package decorator;

import java.util.ArrayList;
import java.util.List;

public class MatchaRedBean implements IBeverage {
    @Override
    public double getCost() {
        return 5.0;
    }

    @Override
    public String getName() {
        return "Matcha Red Bean";
    }

    @Override
    public List<String> getCompositions() {
        List<String> compositions = new ArrayList<>();
        compositions.add(this.getName());
        return compositions;
    }
}
