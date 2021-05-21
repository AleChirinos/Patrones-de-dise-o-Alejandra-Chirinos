package AbstractFactory.Tarea5;

public class Avion {
    private String marca;
    private String capacidad;
    private String modelo;
    private String numeroDeAsientos;

    public Avion(){}

    public Avion(String marca,String capacidad, String modelo, String numeroAsiento){
        this.marca=marca;
        this.capacidad=capacidad;
        this.modelo=modelo;
        this.numeroDeAsientos =numeroAsiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroDeAsientos() {
        return numeroDeAsientos;
    }

    public void setNumeroDeAsientos(String numeroDeAsientos) {
        this.numeroDeAsientos = numeroDeAsientos;
    }

    public void showInfo(){
        System.out.println("Marca del avión: "+ marca);
        System.out.println("Capacidad del avión: "+ capacidad);
        System.out.println("Modelo del avión: "+ modelo);
        System.out.println("Número de asientos del avión: "+ numeroDeAsientos);
    }
}
