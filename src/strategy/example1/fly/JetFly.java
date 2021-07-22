package strategy.example1.fly;

public class JetFly implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying so fast like a jet ✈...");
    }
}
