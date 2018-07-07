import java.util.Iterator;
import utils.List;
import exception.GrammaException;

public class Main{

    public static final void main(String[] args) throws GrammaException{
        
        Grammar l = new Grammar();
        NonTerminal a = new NonTerminal("A");
        NonTerminal b = new NonTerminal("B");

        Terminal at = new Terminal("a");
        Terminal bt = new Terminal("b");

        l.addNonTerminal(a);
        l.addNonTerminal(b);

        l.addTerminal(at);
        l.addTerminal(bt);

        l.addRule(a,bt);
        l.addRule(a,a)

        System.out.println(l.toString());
    }
}