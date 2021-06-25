package iterator;

public interface IInventoryIterator {
    boolean isDone();
    void next();
    IInventoryItem getCurrent();
}
