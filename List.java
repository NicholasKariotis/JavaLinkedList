package LinkedList;

import java.lang.Iterable;
import java.util.Iterator;

public interface List<T> extends Iterable<T>{

    void append(T value);
    T get(int index);
    void set(int index, T value);
    int size();
    
    default Iterator<T> iterator(){
        throw new UnsupportedOperationException("iterator() not supported");
    }
}
