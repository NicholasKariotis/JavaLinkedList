package LinkedList;

import java.util.Iterator;
import mcf.Node;

public class NodeIterator<T> implements Iterator<T>{

    private Node<T> node;

    public NodeIterator(Node<T> node){
        this.node = node;
    }

    @Override
    public boolean hasNext() {
        return this.node != null;
    }

    @Override
    public T next() {
        T el = node.getValue();
        this.node = node.getNext();
        return el;
    }
    
}
