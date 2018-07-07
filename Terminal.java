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
    public boolean equals(Object s){
        if(s == null) return false;
        if(s == this) return true;
        if(!(s instanceof Terminal)) return false;

        Terminal n = (Terminal) s;

        if(n.getSymbol().equals(this.getSymbol())){
            return true;
        }else{
            return false;
        }
    }
}