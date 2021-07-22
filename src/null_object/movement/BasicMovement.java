package null_object.movement;

import null_object.character.GameCharacter;

public class BasicMovement implements IMovement {
    private final GameCharacter character;

    public BasicMovement(GameCharacter character) {
        this.character = character;
    }

    @Override
    public void moveUp() {
        System.out.println("Moving up.");
    }

    @Override
    public void moveDown() {
        System.out.println("Moving down.");
    }

    @Override
    public void moveLeft() {
        System.out.println("Moving left.");
    }

    @Override
    public void moveRight() {
        System.out.println("Moving right.");
    }
}
