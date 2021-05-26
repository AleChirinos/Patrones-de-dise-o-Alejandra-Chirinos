package Interpreter.Tarea8;

public class Cliente {
    public static void main(String[] args) {

        String interpretar = "1 2 3 4 5 6 7 8 9 10";
        NoTerminalExpression interpretarNumerosRomanos = new NoTerminalExpression(interpretar);
        System.out.println("Interpretar numeros decimales: " + interpretar);
        System.out.println("Interpretado numeros romanos: " + interpretarNumerosRomanos.interpretar());
        System.out.println("");

        String interpretar2 = "10 9 8 7 6 5 4 3 2 1";
        NoTerminalExpression interpretarNumerosRomanos2 = new NoTerminalExpression(interpretar2);
        System.out.println("Interpretar numeros decimales: " + interpretar2);
        System.out.println("Interpretado numeros romanos: " + interpretarNumerosRomanos2.interpretar());
        System.out.println("");

        String interpretar3 = "7 1 10 8 5 3";
        NoTerminalExpression interpretarNumerosRomanos3 = new NoTerminalExpression(interpretar3);
        System.out.println("Interpretar numeros decimales: " + interpretar3);
        System.out.println("Interpretado numeros romanos: " + interpretarNumerosRomanos3.interpretar());
    }
}
