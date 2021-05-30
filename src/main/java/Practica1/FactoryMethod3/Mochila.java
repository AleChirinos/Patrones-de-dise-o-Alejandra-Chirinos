package Practica1.FactoryMethod3;

public class Mochila {
    private String numeroDeBolsillos;
    private String tamaño;

    public Mochila(){}

    public String getNumeroDeBolsillos() {
        return numeroDeBolsillos;
    }

    public void setNumeroDeBolsillos(String numeroDeBolsillos) {
        this.numeroDeBolsillos = numeroDeBolsillos;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void showInfo(){
        System.out.println("Numero de bolsillos: "+ numeroDeBolsillos);
        System.out.println("Tamaño: "+ tamaño);
    }
}
