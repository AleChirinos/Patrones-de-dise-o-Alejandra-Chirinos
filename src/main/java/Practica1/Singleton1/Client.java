package Practica1.Singleton1;

public class Client {
    public static void main(String []args){
        Colegio colegioAmorDeDios = new Colegio();

        colegioAmorDeDios.setCajero(new Cajero("Jose001","Jose Perez"));

        colegioAmorDeDios.pagarMatricula(50,new Estudiante("001","Juan"));
        colegioAmorDeDios.pagarMatricula(50,new Estudiante("002","Jose"));
        colegioAmorDeDios.pagarMatricula(50,new Estudiante("003","Joaqui"));
        colegioAmorDeDios.pagarMatricula(50,new Estudiante("004","Javier"));
        colegioAmorDeDios.pagarMatricula(50,new Estudiante("005","Jael"));
    }
}
