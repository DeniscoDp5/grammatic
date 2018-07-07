import exception.GrammaException;
/**
 * This ADT implements the Grammatics as know in math
 * A grammatic is a set of Non terminals Simbols, Terminal Simbols, rules associated with non terminal simbols
 * and a starting simbol.
 * It's possible to make derivations 
 */
public interface Grammatics<Nt,T>{

    /**
     * This Method Sets the Non terminal simbol of the grammar.
     * It must be contained in the set of NonTerminal simbols of the grammatic
     * @param s the initial simbol
     */
    public void setInitialSimbol(Nt s);



    /**
     * This method adds a NonTerminal simbol to the set of non terminal simbols
     * @param nonTermSimb The non terminal simbol to add to the set
     */
    public void addNonTerminal(Nt nonTermSimb) throws GrammaException;


    /**
     * This method adds a Terminal simbol to the set of terminal simbols of the grammar
     * @param termSimbol the terminal simbol to add
     */
    public void addTerminal(T termSimbol) throws GrammaException;

    /**
     * This method adds a derivation rule to the simbols s
     * After this is now possible to make the derivation s -> simb.
     * simb must appear in the set of non terminal simbols or terminal simbol
     * s must appear in the set of non terminal simbols
     * @param s the simbol on wich add the rule
     * @param simb the rule added to s
     */
    public void addRule(Nt s, Symbol simb) throws GrammaException;
}