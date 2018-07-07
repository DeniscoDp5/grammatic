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
    public boolean equals(Object s){
        if(s == null) return false;
        if(s == this) return true;
        if(!(s instanceof NonTerminal)) return false;

        NonTerminal n = (NonTerminal) s;

        if(n.getSymbol().equals(this.getSymbol())){
            return true;
        }else{
            return false;
        }
    }
}