package facade;

public class Main {
    public static void main(String[] args) {
        ICar car = new SimpleCar(
                new FrontLeftWheel(),
                new FrontRightWheel(),
                new RearLeftWheel(),
                new RearRightWheel(),
                new SimpleHorn()
        );
        car.horn();
        car.moveForward();
        car.brake();
        car.moveBackward();
        car.brake();
    }
}
