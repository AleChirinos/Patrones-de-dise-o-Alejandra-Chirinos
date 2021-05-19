package Singleton.Tarea2;

public class Banco {
    public double BolivianosADolares(double cantidad) {
        double total=CambioDeMoneda.getInstance().Cambio(cantidad, "BolivianosADolares");
        System.out.println("INFO> El cambio es:  "+total+" $");
        return total;
    }

    public double BolivianosAEuros(double cantidad) {
        double total=CambioDeMoneda.getInstance().Cambio(cantidad, "BolivianosAEuros");
        System.out.println("INFO> El cambio es: "+total+" €");
        return total;
    }

    public double DolaresAEuros(double cantidad) {
        double total=CambioDeMoneda.getInstance().Cambio(cantidad, "DolaresAEuros");
        System.out.println("INFO> El cambio es: "+total+" €");
        return total;
    }

    public double DolaresABolivianos(double cantidad) {
        double total=CambioDeMoneda.getInstance().Cambio(cantidad, "DolaresABolivianos");
        System.out.println("INFO> El cambio es: "+total+" bs");
        return total;
    }

    public double EurosADolares(double cantidad) {
        double total=CambioDeMoneda.getInstance().Cambio(cantidad, "EurosADolares");
        System.out.println("INFO> El cambio es: "+total+" $");
        return total;
    }

    public double EurosABolivianos(double cantidad) {
        double total=CambioDeMoneda.getInstance().Cambio(cantidad, "EurosABolivianos");
        System.out.println("INFO> El cambio es: "+total+" bs");
        return total;
    }
}
