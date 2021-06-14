package Practica2.Ejercicio2ChainResponsability;

public interface IEjercito {
    void setNext(IEjercito handler); //---> saber el siguiente responsable
    IEjercito next(); //--> ir al siguient responsable
    void orden(String tipoDeOrden); // resolver el problema o moverse al siguinete responsable
}
