package Interpreter.Tarea8;

import java.util.ArrayList;
import java.util.List;

public class NoTerminalExpression extends AbstractExpression{
    private List<AbstractExpression> parseTree = new ArrayList<>();
    private ContextNumerosRomanos context;

    public NoTerminalExpression(String word) {
        this.interpretacion(word);
    }

    public void interpretacion(String romanNumbers) {
        String input = romanNumbers;
        context = new ContextNumerosRomanos(input.replace(" ", ""));
        for (String nums : input.split(" ")) {
            int numeroDecimal = Integer.parseInt(nums);
            if (numeroDecimal <= 3) {
                parseTree.add(new TerminalExpressionI());
            } else if (numeroDecimal <= 8) {
                parseTree.add(new TerminalExpressionV());
            } else if (numeroDecimal <= 10) {
                parseTree.add(new TerminalExpressionX());
            }
        }
    }

    public String interpretar() {
        for (AbstractExpression terminalExpresion : parseTree) {
            terminalExpresion.interpreter(context);
        }
        return context.output;
    }

    @Override
    public void interpreter(ContextNumerosRomanos context) {

    }
}
