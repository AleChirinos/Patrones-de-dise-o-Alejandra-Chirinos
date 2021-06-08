package ChainOfResponsability.Tarea12.Ejercicio2;

public class Cliente {
    public static void main (String[] args){
        Oficina oficina = new Oficina();

        oficina.procesoDeCarnetizacion(new Requisitos(true,true, true));
        oficina.procesoDeCarnetizacion(new Requisitos(false,true, true));
        oficina.procesoDeCarnetizacion(new Requisitos(true,false, true));
        oficina.procesoDeCarnetizacion(new Requisitos(false,false, true));
        oficina.procesoDeCarnetizacion(new Requisitos(false,false, false));
    }
}
