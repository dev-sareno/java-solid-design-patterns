package strategy.example1.duck;

import strategy.example1.display.IDisplayBehavior;
import strategy.example1.fly.IFlyBehavior;
import strategy.example1.fly.SimpleFly;
import strategy.example1.quack.IQuackBehavior;
import strategy.example1.quack.SimpleQuack;

public class Duck implements IFlyBehavior, IQuackBehavior, IDisplayBehavior {
    @Override
    public void fly() {
        new SimpleFly().fly();
    }

    @Override
    public void quack() {
        new SimpleQuack().quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a duck!");
    }
}
