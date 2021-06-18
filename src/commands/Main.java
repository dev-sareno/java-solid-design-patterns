package commands;

public class Main {
    public static void main(String[] args) {
        OnOffOnlyInvoker onOffOnlyInvoker = new OnOffOnlyInvoker(new SimpleOnCommand(), new SimpleOffCommand());
        onOffOnlyInvoker.clickOn();
        onOffOnlyInvoker.clickOff();

        DimOnlyInvoker dimOnlyInvoker = new DimOnlyInvoker(new SimpleDimUpCommand());
        dimOnlyInvoker.clickDim();

        AdvanceInvoker advanceInvoker = new AdvanceInvoker(
                new SimpleOnCommand(),
                new SimpleOffCommand(),
                new SimpleDimUpCommand(),
                new SimpleDimDownCommand()
        );
        advanceInvoker.clickOn();
        advanceInvoker.undoClickOn();
    }
}
