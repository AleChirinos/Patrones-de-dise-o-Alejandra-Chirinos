package Practica1.Interpreter6;

public class Cliente {
    public static void main ( String[] args){
        String toInterpretate= "Como administrador Quiero generar un reporte diario Para evaluar las ganancias";
        System.out.println("Evaluate : "+toInterpretate+"\nInterpretate : " + new NoTerminalExpression(toInterpretate).evaluate());
    }
}
