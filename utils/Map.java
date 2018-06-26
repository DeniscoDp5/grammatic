package utils;

import java.util.Iterator;

public class Map<T,E>{

    List<MapNode> map;
    
    public Map(){
        this.map = new List<MapNode>();
    }

    public MapNode<T,E> add(T obj1, E obj2){
        MapNode<T,E> x = new MapNode<T,E>(obj1,obj2);
        this.map.add(x);
        return x;
    }

    public E getObj(T obj){
        MapNode<T,E> x = this.find(obj);
        return x.getObj2();
    }

    /* public T getObj(E obj){
        MapNode<T,E> x = this.find(obj);
        return (T)x.getObj1();
    } */

    private MapNode<T,E> find(T obj){
        Iterator<MapNode> it = this.map.iterator();
        MapNode<T,E> x = it.next();

        while(x != null){
            if(x.getObj1().equals(obj)){
                return x;
            }
            x = it.next();
        }
        throw new UnsupportedOperationException();
    }

    /* private MapNode<T,E> find(E obj){
        Iterator<MapNode> it = this.map.iterator();
        MapNode<T,E> x = it.next();

        while(x != null){
            if(x.getObj2().equals(obj)){
                return x;
            }
            x = it.next();
        }
        throw new UnsupportedOperationException();
    } */
}