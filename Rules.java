import utils.List;

public class Rules{

    List<Symbol> rules;

    public Rules(){
        this.rules = new List<Symbol>();
    }

    public Rules(String[] list){
        for(int i =0; i< list.length; i++){
            rules.add(new Symbol(list[i]));
        }
    }

    public int getSize(){
        return this.rules.getSize();
    }
    public void push(Rules list){
        this.rules.merge(list.getRules());
    }
    private List<Symbol> getRules(){
        return this.rules;
    }
}