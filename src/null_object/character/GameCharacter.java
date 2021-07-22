package null_object.character;

import null_object.movement.IMovement;

public abstract class GameCharacter {
    private boolean canMove = true;

    public boolean isCanMove() {
        return canMove;
    }

    public void setCanMove(boolean canMove) {
        this.canMove = canMove;
    }

    abstract public IMovement getMovement();
}
