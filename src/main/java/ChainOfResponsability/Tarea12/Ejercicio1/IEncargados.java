package ChainOfResponsability.Tarea12.Ejercicio1;

public interface IEncargados {
    void setNext(IEncargados handler); //---> saber el siguiente responsable
    IEncargados next(); //--> ir al siguient responsable
    void solucionarError(Solicitud solicitud); // resolver el problema o moverse al siguinete responsable

}
