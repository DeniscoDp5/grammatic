/**
 * This class supply an ADT for grammatics
 */
import utils.List;
import java.util.Iterator;
import utils.MapGrammar;
import exception.GrammaException;

public class Grammar<Nt,T> implements Grammatics<NonTerminal,Terminal>{

    public NonTerminal initial;
    public MapGrammar<NonTerminal,List<Symbol> > map;
    public List<NonTerminal> nonTerminalList;
    public List<Terminal> terminalList;

    public Grammar(){
        this.nonTerminalList = new List<NonTerminal>();
        this.terminalList = new List<Terminal>();
        this.map = new MapGrammar<NonTerminal,List<Symbol>>();
    }
    
    /**
     * This method sets the initial simbol of the Grammar
     * @param s the param to set as initial
     */
    public void setInitialSimbol(NonTerminal s) {
        this.initial = s;
    }
    /**
     * This method adds a nonTerminal simbol to the set of non terminal simbols
     * Creates an empty derivation list too; throws exception if the simbol was inserted previusly
     * @param nonTer the non terminal list to add
     * @throws GrammaException if symbol is yet in the set
     */
    public void addNonTerminal(NonTerminal nonTer) throws GrammaException{
        if(!this.nonTerminalList.isIn(nonTer)){
            this.nonTerminalList.add(nonTer);
            this.map.add(nonTer, new List<Symbol>(){
                public String toString(){
                    String out = "";
                    Iterator<Symbol> it = this.iterator();
                    if(it == null){
                        return null;
                    }else{
                        Symbol x =  it.next();

                        while(x != null){
                            out = out + x.getSymbol() + " ";
                            x = it.next();
                        }
                    }
                    return out;

                }
            });
        }else{
            throw new GrammaException("Non Terminal Symbol already in the set");
        }
    }
    /**
     * This method adds a Terminal simbol to the set of terminal simbols
     * @param ter the terminal symbol to add
     * @throws GrammaException if the term symbol is already in the set
     */
    public void addTerminal(Terminal ter) throws GrammaException{
        if(!this.terminalList.isIn(ter)){
            this.terminalList.add(ter);
        }else{
            throw new GrammaException("Terminal Symbol already in the set");
        }
        
    }
    /**
     * This method adds a new derivation rule to thenon terminal symbol
     */
    public void addRule(NonTerminal nTer,Symbol t) throws GrammaException{ //TODO: check if t is in one of the 2 sets of symbols
        List<Symbol> list = this.map.getValue(nTer);
        if(list == null){
            throw new GrammaException("The non terminal symbol is not in the set");
        }else{
            list.add(t);
        }
    }

    public String toString(){
        String out = "";
        Iterator<NonTerminal> it = this.nonTerminalList.iterator();

        if(it == null){
            return null;
        }else{
            NonTerminal x = it.next();
            while(x != null){
                out = out + x.getSymbol() + " --> ";

                List<Symbol> list = this.map.getValue(x);
                String toStr = list.toString();

                if(toStr == null){
                    out = out + '\n';
                }else{
                    out = out + toStr + '\n';
                }
                x = it.next();
            }
        }
        return out;
    }

}