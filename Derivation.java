import utils.List;
import java.util.Iterator;

public class Derivation{
    List<Symbol> value;

    public Derivation(Symbol s){

        this.value = new List<Symbol>();
        this.value.add(s);
    }

    public boolean hasNonTerminals(){
        Iterator<Symbol> it = this.value.iterator();
        Symbol xi = it.next();

        while(xi != null){
            if(xi.isNonTerminal()){
                return true;
            }
            xi = it.next();
        }
        return false;
    }

    public List<Derivation> getRecursiveDerivation(){
        throw new UnsupportedOperationException();
    }

}