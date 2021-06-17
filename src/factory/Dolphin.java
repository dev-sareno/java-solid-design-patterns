package factory;

public class Dolphin extends WaterAnimal {
    private static final double SWIM_SPEED = 2.2;

    public Dolphin(String name) {
        super(name, SWIM_SPEED);
    }

    public void swim() {

    }
}
