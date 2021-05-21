package FactoryMethod.Tarea4;

public class Cliente {
    public  static void main (String[]args){
        CreatorPasajeEstandar crearPasajeStandart = new CreatorPasajeEstandar();
        CreatorPasajeSolidario crearPasajeSolidario = new CreatorPasajeSolidario();
        CreatorPasajeInfante crearPasajeInfantes  = new CreatorPasajeInfante();

        PasajeEstandar pasaje1 = crearPasajeStandart.create();

        PasajeEstandar pasaje2 = crearPasajeStandart.create();
        Pasajero pasajero2 = pasaje2.getPasajero();
        pasajero2.setNombre("Jose");
        pasajero2.setCi("9812375");
        pasaje2.setPasajero(pasajero2);
        pasaje2.setNumeroDeAsiento("17E");

        PasajeSolidario pasaje3 = crearPasajeSolidario.create();

        PasajeSolidario pasaje4 = crearPasajeSolidario.create();
        Pasajero pasajero4 = pasaje4.getPasajero();
        pasajero4.setNombre("Sebastian");
        pasajero4.setCi("6518337");
        pasaje4.setPasajero(pasajero4);
        pasaje4.setNumeroDeAsiento("14B");

        PasajeInfante pasaje5 = crearPasajeInfantes.create();

        PasajeInfante pasaje6 = crearPasajeInfantes.create();
        Pasajero pasajero6 = pasaje6.getPasajero();
        pasajero6.setNombre("Francisco");
        pasajero6.setCi("1324567");
        pasajero6.setFechaDeNacimiento("17/03/2020");
        pasaje6.setPasajero(pasajero6);
        pasaje6.setNumeroDeAsiento("11C");

        System.out.println("Pasaje 1 ");
        pasaje1.crear();
        System.out.println("");
        System.out.println("Pasaje 2 ");
        pasaje2.crear();
        System.out.println("");
        System.out.println("Pasaje 3 ");
        pasaje3.crear();
        System.out.println("");
        System.out.println("Pasaje 4 ");
        pasaje4.crear();
        System.out.println("");
        System.out.println("Pasaje 5 ");
        pasaje5.crear();
        System.out.println("");
        System.out.println("Pasaje 6 ");
        pasaje6.crear();
    }
}
