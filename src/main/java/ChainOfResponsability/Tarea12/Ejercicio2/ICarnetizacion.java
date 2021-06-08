package ChainOfResponsability.Tarea12.Ejercicio2;

public interface ICarnetizacion {
    void setNext(ICarnetizacion handler); //---> saber el siguiente responsable
    ICarnetizacion next(); //--> ir al siguient responsable
    void procesoDeCarnetizacion(Requisitos requisitos); // resolver el problema o moverse al siguinete responsable
}
