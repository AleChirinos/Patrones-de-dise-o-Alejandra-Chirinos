package AbstractFactory.Tarea5;

public class PasajeEstandar implements IPasaje {
    private String numeroDeVuelo;
    private String numeroDeAsiento;
    private String costoDelPasaje;
    private Destino destino;
    private Origen origen;
    private Avion avion;
    private Pasajero pasajero;

    public PasajeEstandar(){
        destino = new Destino();
        origen = new Origen();
        avion = new Avion();
        pasajero = new Pasajero();
    }

    @Override
    public void crear() {
        System.out.println("Pasaje estandar - numero de vuelo: " + numeroDeVuelo);
        System.out.println("Pasaje estandar - numero de asiento: " + numeroDeAsiento);
        System.out.println("Pasaje estandar - costo: " + costoDelPasaje);
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

    public String getCostoDelPasaje() {
        return costoDelPasaje;
    }

    public void setCostoDelPasaje(String costoDelPasaje) {
        this.costoDelPasaje = costoDelPasaje;
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
