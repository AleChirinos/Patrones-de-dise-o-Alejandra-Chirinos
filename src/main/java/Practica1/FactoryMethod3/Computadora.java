package Practica1.FactoryMethod3;

public class Computadora {
    private String marca;
    private String sistemaOperativo;

    public Computadora(){}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public void showInfo(){
        System.out.println("Marca: "+ marca);
        System.out.println("Sistema operativo: "+ sistemaOperativo);
    }
}
