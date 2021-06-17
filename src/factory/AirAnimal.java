package factory;

public class AirAnimal extends Animal {
    private static final String TYPE = "Bird";
    private double flySpeed;

    public AirAnimal(String name, double flySpeed) {
        super(TYPE, name);
        this.flySpeed = flySpeed;
    }

    @Override
    boolean canRun() {
        return false;
    }

    @Override
    boolean canSwim() {
        return false;
    }

    @Override
    boolean canFly() {
        return true;
    }

    public void fly() {
        System.out.println("Flying at the speed of " + this.flySpeed);
    }
}
