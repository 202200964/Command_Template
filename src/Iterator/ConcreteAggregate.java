package Iterator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConcreteAggregate<T> implements Aggregate<T> {
    private T[] data;

    public ConcreteAggregate(T[] data) {
        this.data = data;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(data);
    }

    @Override
    public Iterator<T> createReverseIterator() {
        List<T> dataList = Arrays.asList(data);
        Collections.reverse(dataList);
        return new ConcreteIterator<>(dataList.toArray(data));
    }
}
