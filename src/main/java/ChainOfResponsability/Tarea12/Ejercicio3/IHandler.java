package ChainOfResponsability.Tarea12.Ejercicio3;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();
    void identificarAlgoritmo(ArregloPersonas person_arr);
}
