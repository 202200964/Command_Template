package Iterator;

public interface Aggregate<T> {
    Iterator<T> createIterator();
    Iterator<T> createReverseIterator();
}
