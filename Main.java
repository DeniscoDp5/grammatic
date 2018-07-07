import java.util.Iterator;
import utils.MapGrammar;

public class Main{

    public static final void main(String[] args){
        
        MapGrammar<Integer,String> map = new MapGrammar<Integer,String>();
        map.add(new Integer(1),"Uno");
        map.add(new Integer(2),"Due");

        String l =map.getValue(new Integer(2));
    }
}