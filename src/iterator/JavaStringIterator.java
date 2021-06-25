package iterator;

import java.util.Iterator;

public class JavaStringIterator implements Iterator<String> {
    private String string1;
    private String string2;
    private String string3;
    private int index = 0;

    public JavaStringIterator(String string1, String string2, String string3) {
        this.string1 = string1;
        this.string2 = string2;
        this.string3 = string3;
    }

    @Override
    public boolean hasNext() {
        return this.index < 3;
    }

    @Override
    public String next() {
        if (this.index == 0) {
            this.index += 1;
            return this.string1;
        } else if (this.index == 1) {
            this.index += 1;
            return this.string2;
        } else if (this.index == 2) {
            this.index += 1;
            return this.string3;
        }
        throw new IndexOutOfBoundsException();
    }
}
