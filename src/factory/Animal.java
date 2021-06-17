package factory;

public abstract class Animal {
    private final String type;
    private final String name;

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    abstract boolean canRun();
    abstract boolean canSwim();
    abstract boolean canFly();
}
