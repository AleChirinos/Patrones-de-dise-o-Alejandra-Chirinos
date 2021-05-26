package Interpreter.Tarea8;

public class TerminalExpressionI extends AbstractExpression{

    @Override
    public void interpreter(ContextNumerosRomanos context) {
        int repI = Integer.parseInt(context.input.substring(0, 1));
        for (int i = 0; i < repI; i++) {
            context.output = context.output + "I";
        }
        context.output = context.output + " ";
        context.input = context.input.substring(1);
    }

}
