package Interpreter.Tarea8;

public class TerminalExpressionV extends AbstractExpression{

    @Override
    public void interpreter(ContextNumerosRomanos context) {
        int num = Integer.parseInt(context.input.substring(0, 1));
        if (num == 4) {
            context.output = context.output + "IV";
        } else {
            context.output = context.output + "V";
            for (int i = 0; i < num - 5; i++) {
                context.output = context.output + "I";
            }
        }
        context.output = context.output + " ";
        context.input = context.input.substring(1);
    }

}
