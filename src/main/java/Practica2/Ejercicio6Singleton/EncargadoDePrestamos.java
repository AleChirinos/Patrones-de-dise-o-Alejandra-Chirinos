package Practica2.Ejercicio6Singleton;

public class EncargadoDePrestamos implements IHandler{
    private IHandler next;
    private int actualLoan;

    @Override
    public void setNext(IHandler handler) {
        this.next=handler;
    }

    @Override
    public IHandler next() {
        return this.next;
    }

    @Override
    public void pay(int amount, int primaryLoan) {
        System.out.println("*** ENCARGADO DE PRESTAMOS ***");
        System.out.println("INFO-> Ya completo la deuda");
        System.out.println("INFO-> Le haremos la devolucion de todos sus documentos");
        System.out.println();
    }
}


