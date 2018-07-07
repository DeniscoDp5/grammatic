/**
 * This class supply an ADT for grammatics
 */
import utils.List;
import java.util.Iterator;
import utils.Map;

public class Grammar<Nt,T> implements Grammatics<NonTerminal,Terminal>{

    public NonTerminal initial;
    public Map<NonTerminal,List<Symbol> > map;
    public List<NonTerminal> nonTerminalList;
    public List<Terminal> terminalList;

    public Grammar(){
        this.nonTerminalList = new List<NonTerminal>();
        this.terminalList = new List<Terminal>();
        this.map = new Map<NonTerminal,List<Symbol>>();
    }
    
    /**
     * This method sets the initial simbol of the Grammar
     * @param s the param to set as initial
     */
    public void setInitialSimbol(NonTerminal s){
        this.initial = s;
    }
    /**
     * This method adds a nonTerminal simbol to the set of non terminal simbols
     * Creates an empty derivation list too; Doesn't add if the simbol was inserted previusly
     * @param nonTer the non terminal list to add 
     */
    public void addNonTerminal(NonTerminal nonTer){
        if(!this.nonTerminalList.isIn(nonTer)){
            this.nonTerminalList.add(nonTer);
            this.map.add(nonTer, new List<Symbol>());
        }
    }
    /**
     * This method adds a Terminal simbol to the set of terminal simbols
     */
    public void addTerminal(Terminal ter){
        this.terminalList.add(ter);
    }
    /**
     * This method adds 
     */
    public void addRule(NonTerminal nTer,Symbol t){
        //TODO: continue
    }

}