public class NonTerminal extends Symbol{

    Rules rules;

    public NonTerminal(String simbol){
        super(simbol);
        this.rules = new Rules();
    }

    public String getSimbol(){
        return this.simbol;
    }
    public void addRules(Rules rules){
        if(this.rules.getSize() == 0){
            this.rules = rules;
        }else{
            this.rules.push(rules);
        }
    }
    public boolean isTerminal(){
        return false;
    }
    public boolean isNonTerminal(){
        return true;
    }
}