package strategy.example1.quack;

public class NoQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Cannot quack.");
    }
}
