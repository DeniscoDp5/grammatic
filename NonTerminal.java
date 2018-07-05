public class NonTerminal implements Symbol<String>{

    String simbol;

    public NonTerminal(String simbol){
        this.simbol = simbol;
    }

    public String getSymbol(){
        return this.simbol;
    }
    
    public boolean isTerminal(){
        return false;
    }
    public boolean isNonTerminal(){
        return true;
    }
}