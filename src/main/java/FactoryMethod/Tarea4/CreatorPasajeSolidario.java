package FactoryMethod.Tarea4;

public class CreatorPasajeSolidario extends CreatorPasaje{
    @Override
    public PasajeSolidario create() {

        Pasajero pasajeroSolidario = new Pasajero();
        pasajeroSolidario.setNombre("Luis");
        pasajeroSolidario.setCi("1234567");

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

        PasajeSolidario pasajeSolidario = new PasajeSolidario();
        pasajeSolidario.setNumeroDeVuelo("9733");
        pasajeSolidario.setNumeroDeAsiento("1A");
        pasajeSolidario.setCostoDelPasaje("300 $");
        pasajeSolidario.setDescuento("75 $");
        pasajeSolidario.setMotivoDeDescuento("Millas acumuladas, viajero frecuente");
        pasajeSolidario.setPasajero(pasajeroSolidario);
        pasajeSolidario.setAvion(avion);
        pasajeSolidario.setOrigen(origen);
        pasajeSolidario.setDestino(destino);

        return pasajeSolidario;
    }
}
