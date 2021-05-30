package Practica1.FactoryMethod3;

public class Deportivo {
    private String talla;
    private String numeroDePrendas;
    private String color;

    public Deportivo(){}

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getNumeroDePrendas() {
        return numeroDePrendas;
    }

    public void setNumeroDePrendas(String numeroDePrendas) {
        this.numeroDePrendas = numeroDePrendas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showInfo(){
        System.out.println("Talla: "+ talla);
        System.out.println("Numero de prendas: "+ numeroDePrendas);
        System.out.println("Color: "+ color);
    }
}
