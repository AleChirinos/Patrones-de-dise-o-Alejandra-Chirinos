package Practica1.FactoryMethod3;

public class Cuaderno {
    private String tipo;
    private String numeroDeHojas;

    public Cuaderno(){}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroDeHojas() {
        return numeroDeHojas;
    }

    public void setNumeroDeHojas(String numeroDeHojas) {
        this.numeroDeHojas = numeroDeHojas;
    }

    public void showInfo(){
        System.out.println("Tipo: "+ tipo);
        System.out.println("Numero de hojas: "+ numeroDeHojas);
    }
}
