/**
 * This class supply an ADT for grammatics
 */
import utils.List;
import java.util.Iterator;
import utils.Map;

public class Grammar {

    public Map<NonTerminal,List<Symbol> > map;
    public List<NonTerminal> nonTerminalList;
    public List<Terminal> terminalList;

    public Grammar(){
        this.nonTerminalList = new List<NonTerminal>();
        this.terminalList = new List<Terminal>();
        this.map = new Map<NonTerminal,List<Symbol>>();
    }
    
    /* public void addNonTerminals(String[] nonTermList){
        for(int i=0; i< nonTermList.length; i++){
            this.nonTerminalList.add(new NonTerminal(nonTermList[i]));
        }
    } */
    public void addNonTerminals(NonTerminal T){
        this.nonTerminalList.add(T);
    }
    /* public void addTerminals(String[] termList){
        for(int i =0; i< termList.length; i++){
            this.terminalList.add(new Terminal(termList[i]));
        }
    } */
    public void addTerminal(Terminal t){
        this.terminalList.add(t);
    }
    public void addRules(NonTerminal T,Symbol t){
        List<Symbol> x =  this.map.getObj(T);
        x.add(t);
    }

    public Iterator<NonTerminal> nonTermIterator(){
        return this.nonTerminalList.iterator();
    }
    /**This method calculates every result derivation of depth i */
    public List<Derivation> getRecursiveDerivation(int i){
        List<Derivation> results = new List<Derivation>();

        for(int j = i; j >= 0; j--){

        }
        return new List<Derivation>();
    }
}