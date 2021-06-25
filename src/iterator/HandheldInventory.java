package iterator;

public class HandheldInventory implements IInventory {
    private IInventoryItem rightHandItem;
    private IInventoryItem leftHandItem;

    public HandheldInventory(IInventoryItem rightHandItem, IInventoryItem leftHandItem) {
        this.rightHandItem = rightHandItem;
        this.leftHandItem = leftHandItem;
    }

    @Override
    public IInventoryIterator getIterator() {
        return new HandheldInventoryIterator(this.rightHandItem, this.leftHandItem);
    }
}
