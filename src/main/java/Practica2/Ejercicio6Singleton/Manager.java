package Practica2.Ejercicio6Singleton;

public class Manager implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        this.next = handler;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void pay(int amount, int primaryLoan) {
        Cajero cajero = new Cajero();
        this.setNext(cajero);

        AgenteDeCredito agenteDeCredito = new AgenteDeCredito();
        cajero.setNext(agenteDeCredito);

        Supervisor supervisor = new Supervisor();
        agenteDeCredito.setNext(supervisor);

        EncargadoDePrestamos encargado = new EncargadoDePrestamos();
        supervisor.setNext(encargado);

        this.next.pay(amount, BankSingleton.getInstance().getPrimaryLoan());
    }

}
