package iterator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class JavaStringIterable implements Iterable<String> {
    private String string1;
    private String string2;
    private String string3;

    public JavaStringIterable(String string1, String string2, String string3) {
        this.string1 = string1;
        this.string2 = string2;
        this.string3 = string3;
    }

    @Override
    public Iterator<String> iterator() {
        return new JavaStringIterator(this.string1, this.string2, this.string3);
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<String> spliterator() {
        return Iterable.super.spliterator();
    }
}
