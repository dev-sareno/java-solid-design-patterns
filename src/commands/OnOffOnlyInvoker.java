package commands;

public class OnOffOnlyInvoker {
    private ICommand on;
    private ICommand off;

    public OnOffOnlyInvoker(ICommand on, ICommand off) {
        this.on = on;
        this.off = off;
    }

    public void clickOn() {
        this.on.execute();
    }

    public void clickOff() {
        this.off.execute();
    }
}
