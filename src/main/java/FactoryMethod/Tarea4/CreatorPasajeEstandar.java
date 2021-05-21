package FactoryMethod.Tarea4;

public class CreatorPasajeEstandar extends CreatorPasaje{
    @Override
    public PasajeEstandar create() {

        Pasajero pasajeroEstandar = new Pasajero();
        pasajeroEstandar.setNombre("Alejandra");
        pasajeroEstandar.setCi("6834566");

        Avion avion = new Avion();
        avion.setCapacidad("47000 kilogramos");
        avion.setMarca("Avianca");
        avion.setNumeroDeAsientos("252");
        avion.setModelo("AirBus330");

        Origen origen = new Origen();
        origen.setAeropuerto("Aeropuerto Internacional El Alto");
        origen.setPais("Bolivia");
        origen.setCiudad("La Paz");

        Destino destino = new Destino();
        destino.setAeropuerto("Miami International Aeroport");
        destino.setPais("Etados Unidos");
        destino.setCiudad("Miami");

        PasajeEstandar pasajeEstandar = new PasajeEstandar();
        pasajeEstandar.setNumeroDeVuelo("9733");
        pasajeEstandar.setNumeroDeAsiento("15D");
        pasajeEstandar.setCostoDelPasaje("375 $");
        pasajeEstandar.setPasajero(pasajeroEstandar);
        pasajeEstandar.setAvion(avion);
        pasajeEstandar.setOrigen(origen);
        pasajeEstandar.setDestino(destino);

        return pasajeEstandar;
    }
}
