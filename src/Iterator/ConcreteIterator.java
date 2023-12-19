package Iterator;

import java.util.NoSuchElementException;

public class ConcreteIterator<T> implements Iterator<T> {
    private T[] data;
    private int cursor;

    public ConcreteIterator(T[] data) {
        this.data = data;
        this.cursor = 0;
    }

    @Override
    public boolean hasNext() {
        return (cursor < data.length);
    }

    @Override
    public T next() {
        if (!hasNext()) throw new NoSuchElementException();
        return (T) data[cursor++];
    }
}
