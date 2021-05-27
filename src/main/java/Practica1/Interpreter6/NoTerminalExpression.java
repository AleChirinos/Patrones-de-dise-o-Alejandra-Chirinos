package Practica1.Interpreter6;

import java.util.ArrayList;

public class NoTerminalExpression extends Abstractexpression{

    private ArrayList<Abstractexpression> parseTree = new ArrayList<>();
    private Context context;

    public NoTerminalExpression(String s){
        context = new Context(s);
        for (String token: s.split(" ")) {
            switch(token){
                default:
                    parseTree.add(new TerminalExpression());
                    break;
            }
        }
    }

    public String evaluate(){
        for (Abstractexpression e : parseTree)
            e.interpreter(context);
        return context.output;
    }

    @Override
    public void interpreter(Context context) {
    }
}
