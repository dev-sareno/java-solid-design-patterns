package iterator;

public class Main {
    public static void main(String[] args) {
        IInventory inventory = new HandheldInventory(new SwordInventoryItem(), new MapInventoryItem());
        IInventoryIterator iterator1 = inventory.getIterator();
        while (!iterator1.isDone()) {
            System.out.println("Process started");
            IInventoryIterator iterator2 = inventory.getIterator();
            while (!iterator2.isDone()) {
                IInventoryItem item = iterator2.getCurrent();
                iterator2.next();
                System.out.println("Item name: " + item.getName());
            }
            iterator1.next();
            System.out.println("Process completed");
        }
    }
}
