public class Terminal extends Symbol{
    
    public Terminal(String simbol){
        super(simbol);
    }

    public boolean isTerminal(){
        return true;
    }
    public boolean isNonTerminal(){
        return false;
    }
}