package Practica2.Ejercicio4Strategy;

public class Cellphone {
    private String brand;
    private String model;
    private String gama;
    private int price;

    public Cellphone(String brand, String model, String gama, int price){
        this.brand=brand;
        this.model=model;
        this.gama=gama;
        this.price=price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void showInfo(){
        System.out.println("Marca: "+brand);
        System.out.println("Gama: "+gama);
        System.out.println("Modelo: "+model);
        System.out.println("Precio: "+price);
    }
}
