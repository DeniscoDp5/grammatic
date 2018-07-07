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

    /**
     * Tells if 2 simbols are equals. They are quals if have the same value associated
     * @param s the simbol to compare
     * @return true if s is equal to this. 
     */
    public boolean equals(Object s);
}