package Singleton.Tarea2;

public class CambioDeMoneda {
    private static CambioDeMoneda instance = null;

    private double BolivianosADolares;
    private double BolivianosAEuros;
    private double DolaresAEuros;
    private double DolaresABolivianos;
    private double EurosADolares;
    private double EurosABolivianos;

    private CambioDeMoneda() {
        DolaresABolivianos = 6.96;
        BolivianosADolares = 0.15;
        DolaresAEuros = 0.82;
        EurosADolares = 1.22;
        EurosABolivianos = 8.43;
        BolivianosAEuros = 0.12;
        System.out.println("INFO> Instanciando Cambio de Moneda");
    }

    public static synchronized void makeInstance() {
        if (instance == null)
            instance = new CambioDeMoneda();
    }

    public static CambioDeMoneda getInstance() {
        if (instance == null)
            makeInstance();
        return instance;
    }

    public double Cambio(double cantidad, String tipoDeCambio) {
        if (tipoDeCambio.equals("DolaresABolivianos")) {
            return DolaresABolivianos * cantidad;
        } else if (tipoDeCambio.equals("BolivianosADolares")) {
            return BolivianosADolares * cantidad;
        } else if (tipoDeCambio.equals("DolaresAEuros")) {
            return DolaresAEuros * cantidad;
        } else if (tipoDeCambio.equals("EurosADolares")) {
            return EurosADolares * cantidad;
        } else if (tipoDeCambio.equals("EurosABolivianos")) {
            return EurosABolivianos * cantidad;
        } else if (tipoDeCambio.equals("BolivianosAEuros")) {
            return BolivianosAEuros * cantidad;
        } else
            return 0;
    }
}
