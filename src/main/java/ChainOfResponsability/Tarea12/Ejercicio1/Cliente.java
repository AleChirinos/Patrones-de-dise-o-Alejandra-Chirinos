package ChainOfResponsability.Tarea12.Ejercicio1;

public class Cliente {
    public static void main (String []ar){
        Encargado encargado = new Encargado();

        encargado.solucionarError(new Solicitud(true,false,false,false,false,false ));
        encargado.solucionarError(new Solicitud(false,true,false,false,false,false ));
        encargado.solucionarError(new Solicitud(false,false,true,false,false,false ));
        encargado.solucionarError(new Solicitud(false,false,false,true,false,false ));
        encargado.solucionarError(new Solicitud(false,false,false,false,true,false ));
        encargado.solucionarError(new Solicitud(false,false,false,false,false,true ));

    }
}
