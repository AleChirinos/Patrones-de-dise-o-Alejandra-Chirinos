package Practica2.Ejercicio2ChainResponsability;

public class Teniente implements IEjercito{
    private IEjercito next;

    @Override
    public void setNext(IEjercito handler) {
        this.next=handler;
    }

    @Override
    public IEjercito next() {
        return this.next;
    }

    @Override
    public void orden(String tipoDeOrden) {
        if (tipoDeOrden.equals("DISCIPLINA")){
            System.out.println("INFO> Teniente regula la disciplina");
            System.out.println();
        } else {
            this.next.orden(tipoDeOrden);
        }
    }
}
