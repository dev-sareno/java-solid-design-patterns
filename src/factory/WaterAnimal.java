package factory;

public class WaterAnimal extends Animal {
    private static final String TYPE = "Fish";
    private double swimSpeed;

    public WaterAnimal(String name, double swimSpeed) {
        super(TYPE, name);
        this.swimSpeed = swimSpeed;
    }

    @Override
    boolean canRun() {
        return false;
    }

    @Override
    boolean canSwim() {
        return true;
    }

    @Override
    boolean canFly() {
        return false;
    }

    public void swim() {
        System.out.println("Swimming at the speed of " + this.swimSpeed);
    }
}
