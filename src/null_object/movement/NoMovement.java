package null_object.movement;

/*
* This is the Null Object
* */
public class NoMovement implements IMovement {
    @Override
    public void moveUp() {
        System.out.println("Cannot move.");
    }

    @Override
    public void moveDown() {
        System.out.println("Cannot move.");
    }

    @Override
    public void moveLeft() {
        System.out.println("Cannot move.");
    }

    @Override
    public void moveRight() {
        System.out.println("Cannot move.");
    }
}
