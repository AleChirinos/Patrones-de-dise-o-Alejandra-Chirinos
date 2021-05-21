package FactoryMethod.Tarea4;

public class CreatorPasajeInfante extends CreatorPasaje{
    @Override
    public PasajeInfante create() {
        Pasajero pasajeroInfante = new Pasajero();
        pasajeroInfante.setNombre("Nicolas");
        pasajeroInfante.setCi("5463278");
        pasajeroInfante.setFechaDeNacimiento("01/01/2017");

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

        PasajeInfante pasajeInfante = new PasajeInfante();
        pasajeInfante.setNumeroDeVuelo("9733");
        pasajeInfante.setNumeroDeAsiento("55F");
        pasajeInfante.setCostoEspecial("325 $");
        pasajeInfante.setPasajero(pasajeroInfante);
        pasajeInfante.setAvion(avion);
        pasajeInfante.setOrigen(origen);
        pasajeInfante.setDestino(destino);

        return pasajeInfante;
    }
}
