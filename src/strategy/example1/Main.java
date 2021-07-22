package strategy.example1;

import strategy.example1.duck.CityDuck;
import strategy.example1.duck.Duck;
import strategy.example1.duck.RubberDuck;
import strategy.example1.duck.WildDuck;

public class Main {
    public static void main(String[] args) {
        Duck cityDuck = new CityDuck();
        cityDuck.display();
        cityDuck.fly();
        cityDuck.quack();

        Duck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.fly();
        wildDuck.quack();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.fly();
        rubberDuck.quack();
    }
}
