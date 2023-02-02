package LinkedList;
import java.util.Arrays;

public class ArrayList<T> implements List<T>{

    protected Object[] elements;
    protected int size;

    public ArrayList(){
        this.elements = new Object[2];
        size = 0;
    }

    @Override
    public ArrayIterator<T> iterator(){
        return new ArrayIterator<T>(this.elements, this.size);
    }

    @Override
    public void append(T value) {
        if(size == elements.length){
            elements = Arrays.copyOf(elements, size*2);
        }
        // Is ok to create an object array and assign type T to it.
        elements[size] = value;
        size++;
        
    }

    @Override
    public T get(int index) {
        return (T)elements[index];
    }

    @Override
    public void set(int index, T value) {
        elements[index] = value;
        
    }

    @Override
    public int size() {
        return this.size;
    }
    
}
