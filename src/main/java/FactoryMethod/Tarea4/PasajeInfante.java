package FactoryMethod.Tarea4;

public class PasajeInfante implements IPasaje{
    private String numeroDeVuelo;
    private String numeroDeAsiento;
    private String costoEspecial;
    private Destino destino;
    private Origen origen;
    private Avion avion;
    private Pasajero pasajero;

    public PasajeInfante(){
        destino = new Destino();
        origen = new Origen();
        avion = new Avion();
        pasajero = new Pasajero();
    }

    @Override
    public void crear() {
        System.out.println("Pasaje infante - numero de vuelo: " + numeroDeVuelo);
        System.out.println("Pasaje infante - numero de asiento: " + numeroDeAsiento);
        System.out.println("Pasaje infante - costo: " + costoEspecial);
        destino.showInfo();
        origen.showInfo();
        avion.showInfo();
        pasajero.showInfo();
    }

    public String getNumeroDeVuelo() {
        return numeroDeVuelo;
    }

    public void setNumeroDeVuelo(String numeroDeVuelo) {
        this.numeroDeVuelo = numeroDeVuelo;
    }

    public String getNumeroDeAsiento() {
        return numeroDeAsiento;
    }

    public void setNumeroDeAsiento(String numeroDeAsiento) {
        this.numeroDeAsiento = numeroDeAsiento;
    }

    public String getCostoEspecial() {
        return costoEspecial;
    }

    public void setCostoEspecial(String costoEspecial) {
        this.costoEspecial = costoEspecial;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Origen getOrigen() {
        return origen;
    }

    public void setOrigen(Origen origen) {
        this.origen = origen;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
}
