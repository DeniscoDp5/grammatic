public class Symbol{
    String simbol;

    public Symbol(String simbol){
        this.simbol = simbol;
    }
    public boolean isNonTerminal(){
        throw new UnsupportedOperationException();
    };

    public boolean isTerminal(){
        throw new UnsupportedOperationException();
    };
}