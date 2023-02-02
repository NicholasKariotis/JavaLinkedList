package LinkedList;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {

    private Object[] elements;
    private int index;
    private int size;

    public ArrayIterator(Object[] elements, int stopIndex){
        this.elements = elements;
        this.size = stopIndex;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < size;
    }

    @Override
    public T next() {
        T element = (T)elements[index];
        index ++;
        return element;
    }
    
}
