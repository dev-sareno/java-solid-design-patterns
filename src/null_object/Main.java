package null_object;

import null_object.character.GameCharacter;
import null_object.character.Protagonist;

public class Main {
    public static void main(String[] args) {
        GameCharacter protagonist = new Protagonist();
        protagonist.getMovement().moveUp();
        protagonist.getMovement().moveUp();

        // Character hit into something that made it frozen for certain amount of time
        protagonist.setCanMove(false);

        // The the user keep clicking the left button
        protagonist.getMovement().moveLeft();
        protagonist.getMovement().moveLeft();
        protagonist.getMovement().moveLeft();

        // Then the character unfroze
        protagonist.setCanMove(true);

        // The use keeps clicking the left button
        protagonist.getMovement().moveLeft();
        protagonist.getMovement().moveLeft();
    }
}
