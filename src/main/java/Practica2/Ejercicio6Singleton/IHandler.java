package Practica2.Ejercicio6Singleton;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();
    void pay(int amount,int primaryLoan);
}
