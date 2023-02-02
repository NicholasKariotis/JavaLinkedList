package LinkedList;
import java.util.Iterator;

import mcf.Node;

public class LinkedList<T> implements List<T>{

    protected int size;
    protected Node<T> head;
    protected Node<T> tail;

    public LinkedList(){
        this.head = new Node<>(null);
        this.tail = new Node<>(null);
        this.size = 0;
    }

    @Override
    public Iterator<T> iterator(){
        return new NodeIterator<>(this.head);
    }

    @Override
    public void append(T value) {
        Node<T> newNode = new Node<>(value);
        // Node to hold new Value
        if(this.size == 0){
            this.head = newNode;
            this.tail = newNode;
            this.head.next = this.tail;
            this.size++;
        }else if(this.size == 1){
            this.tail = newNode;
            this.head.next = this.tail;
            this.size++;
        }else{
            this.tail.next = newNode;
            this.tail = newNode; 
            this.size++;
        }
    }

    @Override
    public T get(int index) {
        if(index > this.size){
            throw new IndexOutOfBoundsException();
        }

        if(index == 0){
            return this.head.value;
        }else{
            int counter = 0;
            Node<T> head = this.head;
            T value = this.head.value;
            while(counter < index){
                value = head.next.value;

                head = head.next;
                counter++;
            }
            return value; 
        }
        
    }

    @Override
    public void set(int index, T value) {
        if(index > this.size){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){
            this.head.value = value;
        }else{
            int counter = 0;
            Node<T> head = this.head;
            while(counter != index){
                counter++;
                head = head.next;
            }
            head.value = value;
        }
        
    }

    @Override
    public int size() {
        return this.size;
    }
    
}
