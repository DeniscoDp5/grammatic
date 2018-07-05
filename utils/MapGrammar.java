package utils;

import java.util.Iterator;
import utils.List;
import utils.MapNode;

/**
 * This ADT implements an HasMap between a key and an object
 * The map can be empty. When a key is add it must be added a value too
 */
public class MapGrammar<K,V>{

    List<MapNode<K,V>> map;
    
    public MapGrammar(){
        this.map = new List<MapNode<K,V>>();
    }

    /**
     * Add a new relation between the key and the value
     * @param key the key 
     * @param value the vlue to associate with the key
     * @throws Exception if the key is already in relation with another key
     */
    public void add(K key, V value) throws UnsupportedOperationException{
        MapNode<K,V> tmp = new MapNode<K,V>(key,value);

        Iterator<MapNode<K,V>> it =  this.map.iterator();
        if(it == null){
            System.out.println("null");
        }
        MapNode<K,V> x = it.next();
        boolean bool = true;
        
        System.out.println(x);
        while(x != null && bool){
            if(x.equals(tmp)){
                bool = false;
            }
            x = it.next();
        }

        if( bool == false){
            throw new UnsupportedOperationException("Key is already in relation with ");
        }else{
            this.map.add(tmp);
        }
    }
    // public MapNode<T,E> add(T key, E value){
    //     MapNode<T,E> x = new MapNode<T,E>(key,value);
    //     this.map.add(x);
    //     return x;
    // }

    // public E getObj(T obj){
    //     MapNode<T,E> x = this.find(obj);
    //     return x.getObj2();
    // }

    // /* public T getObj(E obj){
    //     MapNode<T,E> x = this.find(obj);
    //     return (T)x.getObj1();
    // } */

    // private MapNode<T,E> find(T obj){
    //     Iterator<MapNode> it = this.map.iterator();
    //     MapNode<T,E> x = it.next();

    //     while(x != null){
    //         if(x.getObj1().equals(obj)){
    //             return x;
    //         }
    //         x = it.next();
    //     }
    //     throw new UnsupportedOperationException();
    // }

    // /* private MapNode<T,E> find(E obj){
    //     Iterator<MapNode> it = this.map.iterator();
    //     MapNode<T,E> x = it.next();

    //     while(x != null){
    //         if(x.getObj2().equals(obj)){
    //             return x;
    //         }
    //         x = it.next();
    //     }
    //     throw new UnsupportedOperationException();
    // } */
}