public class Terminal implements Symbol<String>{
    
    String simbol;

    public Terminal(String simbol){
        this.simbol = simbol;
    }

    public boolean isTerminal(){
        return true;
    }
    public boolean isNonTerminal(){
        return false;
    }
    public String getSymbol(){
        return this.simbol;
    }
}