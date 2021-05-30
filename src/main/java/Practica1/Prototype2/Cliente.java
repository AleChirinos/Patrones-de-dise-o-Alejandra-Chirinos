package Practica1.Prototype2;

import Prototype.Tarea3.SamsungR10;

public class Cliente {
    public static void main (String[]args){
        ContratoDocente docente = new ContratoDocente();
        docente.setNombre("");
        docente.setApellido("");
        docente.setMarcadoHoradeEntrada("08:00");
        docente.setMarcadoHoradeSalida("18:00");
        docente.setMarcadoBiometrico("No");
        docente.setAccesoAlaPlataforma("Si");
        docente.setCursoDeEducacionSuperior("Si");
        docente.setCargaHoraria("80");
        docente.setSueldo("5000 bs");

        ContratoDocente docente1= (ContratoDocente) docente.clone();
        docente.setNombre("Luisa");
        docente.setApellido("Torrez");

        ContratoDocente docente2= (ContratoDocente) docente.clone();
        docente2.setNombre("Maria");
        docente2.setApellido("Sanjinez");

        ContratoDocente docente3= (ContratoDocente) docente.clone();
        docente3.setNombre("Jose");
        docente3.setApellido("Ugarte");

        ContratoDocente docente4= (ContratoDocente) docente.clone();
        docente4.setNombre("Carlos");
        docente4.setApellido("Prado");

        ContratoDocente docente5= (ContratoDocente) docente.clone();
        docente5.setNombre("Luis");
        docente5.setApellido("Vera");

        ContratoDocente docente6= (ContratoDocente) docente.clone();
        docente6.setNombre("Paul");
        docente6.setApellido("Landaeta");

        ContratoDocente docente7= (ContratoDocente) docente.clone();
        docente7.setNombre("Sergio");
        docente7.setApellido("Barrios");

        ContratoDocente docente8= (ContratoDocente) docente.clone();
        docente8.setNombre("Rodrigo");
        docente8.setApellido("Arias");

        ContratoDocente docente9= (ContratoDocente) docente.clone();
        docente9.setNombre("Pablo");
        docente9.setApellido("Torrez");

        ContratoDocente docente10= (ContratoDocente) docente.clone();
        docente10.setNombre("Cecilia");
        docente10.setApellido("Ergueta");

        ContratoDocente docente11= (ContratoDocente) docente.clone();
        docente11.setNombre("Jorge");
        docente11.setApellido("Ibañez");

        ContratoDocente docente12= (ContratoDocente) docente.clone();
        docente12.setNombre("Nicolas");
        docente12.setApellido("Custer");

        ContratoDocente docente13= (ContratoDocente) docente.clone();
        docente13.setNombre("Bernardo");
        docente13.setApellido("Cabrera");

        ContratoDocente docente14= (ContratoDocente) docente.clone();
        docente14.setNombre("Freddy");
        docente14.setApellido("Claure");

        ContratoDocente docente15= (ContratoDocente) docente.clone();
        docente15.setNombre("Sebastian");
        docente15.setApellido("Mercado");

        docente1.showInformation();
        docente2.showInformation();
        docente3.showInformation();
        docente4.showInformation();
        docente5.showInformation();
        docente6.showInformation();
        docente7.showInformation();
        docente8.showInformation();
        docente9.showInformation();
        docente10.showInformation();
        docente11.showInformation();
        docente12.showInformation();
        docente13.showInformation();
        docente14.showInformation();
        docente15.showInformation();
    }
}
