package strategy.example1.duck;

import strategy.example1.fly.JetFly;

public class WildDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm a wild duck!");
    }

    @Override
    public void fly() {
        new JetFly().fly();
    }
}
