public interface Symbol<E>{

    /**
     * Tells if this simbol is nonterminal
     * @return true if is non terminal false otherwise 
     */
    public boolean isNonTerminal();

    /**
     * Tells if this simbol is terminal
     * @return true if is terminal false otherwise
     */
    public boolean isTerminal();

    /**
     * Returns the value of the simbol
     */
    public E getSymbol();
}