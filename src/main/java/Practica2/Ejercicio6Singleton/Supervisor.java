package Practica2.Ejercicio6Singleton;

public class Supervisor implements IHandler{
    private IHandler next;
    private int actualLoan;

    @Override
    public void setNext(IHandler handler) {
        this.next=handler;
    }

    @Override
    public IHandler next() {
        return this.next;
    }

    @Override
    public void pay(int amount, int primaryLoan) {
        actualLoan=BankSingleton.getInstance().getLoan()-amount;
        if(((primaryLoan-actualLoan)>=(BankSingleton.getInstance().getLoan()*0.5)) && ((primaryLoan-actualLoan)<(BankSingleton.getInstance().getLoan()))){
            System.out.println("*** SUPERVISOR ***");
            System.out.println("INFO-> Se esta haciendo el pago al supervisor de: "+amount);
            System.out.println("INFO-> Le ofrecemos nuevos prestamos");
            BankSingleton.getInstance().payLoan(amount);
            System.out.println();
        }else{
            next.pay(amount, primaryLoan);
        }
    }
}


