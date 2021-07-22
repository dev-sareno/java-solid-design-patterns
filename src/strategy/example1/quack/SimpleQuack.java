package strategy.example1.quack;

public class SimpleQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quacking simple...");
    }
}
