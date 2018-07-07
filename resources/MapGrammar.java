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

        // if(it == null){
        //     System.out.println("null");
        // }

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
    /**
     * This method returns the value associated with the key
     * Returns null if the key is not in the keys set
     * @param key the key to look for
     * @return The value associate with the key if present, null otherwise
     */
    public V getValue(K key){

        Iterator<MapNode<K,V>> it =  this.map.iterator();
        if (it == null){
            return null;
        }
        MapNode<K,V> x = it.next();
        while(x != null && !x.getKey().equals(key)){
            x = it.next();
        }

        if(x == null){
            return null;
        }else{
            return x.getValue();
        }
    }

}