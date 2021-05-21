package AbstractFactory.Tarea5;

public class FactoryPasaje {

    public enum typePasaje {
        PASAJE_STANDART, PASAJE_SOLIDARIO, PASAJE_INFANTIL
    }

    public static IPasaje make(typePasaje type) {
        IPasaje pasaje;
        switch (type) {
            case PASAJE_STANDART:
                pasaje = new PasajeEstandar();
                ((PasajeEstandar) pasaje).setAvion(new Avion("F1","50","Modelo1","50"));
                ((PasajeEstandar) pasaje).setCostoDelPasaje("50bs");
                ((PasajeEstandar) pasaje).setDestino(new Destino("EEUU","NY","AER1"));
                ((PasajeEstandar) pasaje).setOrigen(new Origen("BOLVIA","LP","AER2"));
                ((PasajeEstandar) pasaje).setNumeroDeAsiento("0");
                ((PasajeEstandar) pasaje).setPasajero(new Pasajero());
                break;
            case PASAJE_SOLIDARIO:
                pasaje = new PasajeSolidario();
                break;
            case PASAJE_INFANTIL:
                pasaje = new PasajeInfante();
                break;
            default:
                pasaje = new PasajeInfante();
                break;
        }
        return pasaje;
    }
}