package utils;
import java.util.Iterator;
import utils.Node;

public class List<T> implements Iterable<T>{
    Node<T> head;
    Node<T> tail;
    int size;

    public List(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(T value){
        if(this.head == null){
            this.head = new Node<T>(value);
            this.tail = this.head;
        }else{
            this.tail.setNext(new Node<T>(value));
            this.tail = this.tail.getNext();
        }
        this.size++;
    }
    public int getSize(){
        return this.size;
    }

    public void merge(List<T> list2){
        int size2 = list2.getSize();
        this.tail.setNext(list2.head);

        this.tail= list2.tail;
        this.size = this.size + size2;
    }

    
    @Override
    public Iterator<T> iterator(){
        Node<T> l = this.head;
        Iterator<T> it = new Iterator<T>(){
            Node<T> currentNode = l;

            @Override
            public boolean hasNext(){
                throw new UnsupportedOperationException();
                /* if(this.getCurrentNode().getNext() != null){
                    return true;
                }
                return false; */
            }
            @Override
            public T next(){
                if(this.currentNode == null){
                    return null;
                }
                T value = this.getCurrentNode().getValue();
                this.currentNode = this.getCurrentNode().getNext();

                return value;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

            public Node<T> getCurrentNode(){
                return this.currentNode;
            }
        };
        return it;
    }
}