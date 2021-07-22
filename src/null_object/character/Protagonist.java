package null_object.character;

import null_object.movement.BasicMovement;
import null_object.movement.IMovement;
import null_object.movement.NoMovement;

public class Protagonist extends GameCharacter {
    @Override
    public IMovement getMovement() {
        if (this.isCanMove()) {
            return new BasicMovement(this);
        } else {
            return new NoMovement();
        }
    }
}
