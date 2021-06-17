package factory;

public class Dog extends LandAnimal {
    private static final double WALK_SPEED = 1.5;

    public Dog(String name) {
        super(name, WALK_SPEED);
    }
}
