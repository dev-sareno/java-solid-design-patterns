package iterator;

public class HandheldInventoryIterator implements IInventoryIterator {
    private IInventoryItem rightHandItem;
    private IInventoryItem leftHandItem;
    private int index = 0;

    public HandheldInventoryIterator(IInventoryItem rightHandItem, IInventoryItem leftHandItem) {
        this.rightHandItem = rightHandItem;
        this.leftHandItem = leftHandItem;
    }

    @Override
    public boolean isDone() {
        return this.index > 1;
    }

    @Override
    public void next() {
        this.index += 1;
    }

    @Override
    public IInventoryItem getCurrent() {
        switch (this.index) {
            case 0: return this.leftHandItem;
            case 1: return this.rightHandItem;
            default: throw new IndexOutOfBoundsException();
        }
    }
}
