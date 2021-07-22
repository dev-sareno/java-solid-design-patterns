package strategy.example1.duck;

import strategy.example1.fly.NoFly;
import strategy.example1.quack.NoQuack;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm a rubber duck and I'm dumb!");
    }

    @Override
    public void fly() {
        new NoFly().fly();
    }

    @Override
    public void quack() {
        new NoQuack().quack();
    }
}
