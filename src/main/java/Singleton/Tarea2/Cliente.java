package Singleton.Tarea2;

public class Cliente {
    public static void main(String[] args) {
        CasaDeCambio casaDeCambio = new CasaDeCambio();
        Banco banco = new Banco();
        LibreCambista libreCambistas = new LibreCambista();

        banco.BolivianosAEuros(100);
        banco.BolivianosADolares(50);
        casaDeCambio.DolaresAEuros(25);
        casaDeCambio.DolaresABolivianos(1000);
        libreCambistas.EurosADolares(77);
        libreCambistas.EurosABolivianos(500);
    }
}
