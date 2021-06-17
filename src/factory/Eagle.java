package factory;

public class Eagle extends AirAnimal {
    private static final double FLY_SPEED = 5.0;

    public Eagle(String name) {
        super(name, FLY_SPEED);
    }
}
