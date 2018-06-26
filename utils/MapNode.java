package utils;
public class MapNode<T,E> {

    T obj1;
    E obj2;

    public MapNode(T obj1, E obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1(){
        return this.obj1;
    }

    public E getObj2(){
        return this.obj2;
    }
}