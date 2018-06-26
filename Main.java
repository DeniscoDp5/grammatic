import utils.List;
//import utils.Node;
//import utils.Node;
import java.util.Iterator;

public class Main{

    public static final void main(String[] args){
        
        NonTerminal A = new NonTerminal("A");
        NonTerminal B = new NonTerminal("B");
        
        Terminal a =new Terminal("a");
        Terminal b =new Terminal("b");

        Grammar G = new Grammar();
        G.addTerminal(a);
        G.addTerminal(b);

        G.addNonTerminals(A);
        G.addNonTerminals(B);

        G.addRules(A,a);
        G.addRules(A,A);
    }
}