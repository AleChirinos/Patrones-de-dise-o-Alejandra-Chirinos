package Practica2.Ejercicio6Singleton;

public class BankSingleton {
    //atributo del mismo tipo
    private static BankSingleton instance=null;
    private int loan;
    private int primaryLoan;

    //Constructor privado
    private BankSingleton(){
        loan=100;
        System.out.println("El prestamo inicial es de: "+primaryLoan);
    }

    public static synchronized void makeinstance(){
        if (instance==null) {
            instance=new BankSingleton();
        }
    }

    //metodo estatico publico que retorna la instancia unica
    public static BankSingleton getInstance(){
        if (instance==null) {
            makeinstance();
        }
        return instance;
    }

    public synchronized int payLoan(int amount) {
        loan = loan- amount;
        System.out.println("Su deuda actual es: "+loan);
        return loan;
    }

    public static void setInstance(BankSingleton instance){
        BankSingleton.instance = instance;
    }

    public int getLoan() {
        return loan;
    }

    public void setLoan(int loan) {
        this.loan = loan;
    }

    public int getPrimaryLoan() {
        return primaryLoan;
    }

    public void setPrimaryLoan(int primaryLoan) {
        this.primaryLoan = primaryLoan;
    }
}
