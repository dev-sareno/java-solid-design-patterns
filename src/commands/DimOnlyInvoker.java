package commands;

public class DimOnlyInvoker {
    private ICommand dim;

    public DimOnlyInvoker(ICommand dim) {
        this.dim = dim;
    }

    public void clickDim() {
        this.dim.execute();
    }
}
