package Practica2.Ejercicio2ChainResponsability;

public class Cabo implements IEjercito{
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
        if (tipoDeOrden.equals("LIMPIEZA")){
            System.out.println("INFO> Cabo hace la limpieza");
            System.out.println();
        } else {
            System.out.println("INFO> ERROR");
        }
    }
}
