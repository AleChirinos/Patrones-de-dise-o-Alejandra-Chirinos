package Practica2.Ejercicio6Singleton;

public class Client {
    public static void main(String[] args){
        Manager manager = new Manager();
        BankSingleton.getInstance().setPrimaryLoan(100);
        manager.pay(10, 100);
        manager.pay(20, 100);
        manager.pay(30, 100);
        manager.pay(40, 100);
    }
}
