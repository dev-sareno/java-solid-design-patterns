package strategy.example1.fly;

public class NoFly implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("Cannot fly.");
    }
}
