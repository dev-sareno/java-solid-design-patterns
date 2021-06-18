package commands;

public class AdvanceInvoker {
    private ICommand on;
    private ICommand off;
    private ICommand dimUp;
    private ICommand dimDown;

    public AdvanceInvoker(ICommand on, ICommand off, ICommand dimUp, ICommand dimDown) {
        this.on = on;
        this.off = off;
        this.dimUp = dimUp;
        this.dimDown = dimDown;
    }

    public void clickOn() {
        this.on.execute();
    }

    public void undoClickOn() {
        this.on.unExecute();
    }

    public void clickOff() {
        this.off.execute();
    }

    public void undoClickOff() {
        this.off.unExecute();
    }

    public void clickDimUp() {
        this.dimUp.execute();
    }

    public void undoClickDimUp() {
        this.dimUp.unExecute();
    }

    public void clickDimDown() {
        this.dimDown.execute();
    }

    public void undoClickDimDown() {
        this.dimDown.unExecute();
    }
}
