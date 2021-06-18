package facade;

public class SimpleCar implements ICar {
    private IWheel frontLeftWheel;
    private IWheel frontRightWheel;
    private IWheel rareLeftWheel;
    private IWheel rareRightWheel;
    private IHorn horn;

    public SimpleCar(IWheel frontLeftWheel, IWheel frontRightWheel, IWheel rareLeftWheel, IWheel rareRightWheel, IHorn horn) {
        this.frontLeftWheel = frontLeftWheel;
        this.frontRightWheel = frontRightWheel;
        this.rareLeftWheel = rareLeftWheel;
        this.rareRightWheel = rareRightWheel;
        this.horn = horn;
    }

    @Override
    public void moveForward() {
        this.frontLeftWheel.rollForward();
        this.frontRightWheel.rollForward();
        this.rareLeftWheel.rollForward();
        this.rareRightWheel.rollForward();
    }

    @Override
    public void moveBackward() {
        this.frontLeftWheel.rollBackward();
        this.frontRightWheel.rollBackward();
        this.rareLeftWheel.rollBackward();
        this.rareRightWheel.rollBackward();
    }

    @Override
    public void brake() {
        this.frontLeftWheel.stop();
        this.frontRightWheel.stop();
        this.rareLeftWheel.stop();
        this.rareRightWheel.stop();
    }

    @Override
    public void horn() {
        this.horn.ensureConnectedToPowerSupply();
        this.horn.hornStart();
        // After 0.2 seconds
        this.horn.hornStop();
    }
}
