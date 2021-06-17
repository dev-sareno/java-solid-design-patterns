package factory;

public abstract class LandAnimal extends Animal {
    private static final String TYPE = "Mammal";
    private double walkSpeed;

    public LandAnimal(String name, double walkSpeed) {
        super(TYPE, name);
        this.walkSpeed = walkSpeed;
    }

    @Override
    boolean canRun() {
        return true;
    }

    @Override
    boolean canSwim() {
        return false;
    }

    @Override
    boolean canFly() {
        return false;
    }

    public void walk() {
        System.out.println("Walking at the speed of " + this.walkSpeed);
    }
}
