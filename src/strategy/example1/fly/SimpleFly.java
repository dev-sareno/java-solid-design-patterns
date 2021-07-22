package strategy.example1.fly;

public class SimpleFly implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying simple...");
    }
}
