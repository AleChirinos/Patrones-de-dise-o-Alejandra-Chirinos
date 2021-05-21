package AbstractFactory.Tarea5;

public class Cliente {
    public static void main (String []args){
        PasajeEstandar a1= (PasajeEstandar) FactoryPasaje.make(FactoryPasaje.typePasaje.PASAJE_STANDART);
        a1.setPasajero(new Pasajero("99999","JOSE"));
        a1.setNumeroDeAsiento("50");
        a1.crear();

        PasajeEstandar a2= (PasajeEstandar) FactoryPasaje.make(FactoryPasaje.typePasaje.PASAJE_STANDART);
        a2.setPasajero(new Pasajero("11111","JUAN"));
        a2.setNumeroDeAsiento("49");
        a2.crear();

        PasajeInfante a3= (PasajeInfante) FactoryPasaje.make(FactoryPasaje.typePasaje.PASAJE_INFANTIL);
        a3.setPasajero(new Pasajero("11111","JUAN","20/1/2021"));
        a3.setNumeroDeAsiento("1");
        a3.crear();


    }
}
