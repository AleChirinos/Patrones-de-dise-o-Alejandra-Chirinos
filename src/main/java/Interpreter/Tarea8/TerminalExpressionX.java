package Interpreter.Tarea8;

public class TerminalExpressionX extends AbstractExpression{
    @Override
    public void interpreter(ContextNumerosRomanos context) {
        int num = Integer.parseInt(context.input.substring(0, 1));
        if (num == 9) {
            context.output = context.output + "IX";
        } else {
            context.input = context.input.substring(1);
            context.output = context.output + "X";
        }
        context.output = context.output + " ";
        context.input = context.input.substring(1);
    }
}
