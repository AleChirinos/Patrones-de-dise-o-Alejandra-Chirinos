package Practica1.AbstractFactory4;

import AbstractFactory.Tarea6.*;

public class Cliente {
    public static void main (String []args) {

        Ingles i1 = (Ingles) FactoryMateria.make(FactoryMateria.typeMateria.MATERIA_INGLES);
        i1.setEstudiante(new Estudiante("Nicolas", "Arias", "005"));
        i1.crear();

        Historia h1 = (Historia) FactoryMateria.make(FactoryMateria.typeMateria.MATERIA_HISTORIA);
        h1.setEstudiante(new Estudiante("Sabrina", "Bohorquez", "006"));
        h1.crear();

        Matematicas m1 = (Matematicas) FactoryMateria.make(FactoryMateria.typeMateria.MATERIA_MATEMATICAS);
        m1.setEstudiante(new Estudiante("Sergio", "Bonilla", "007"));
        m1.crear();

        Lenguaje l1 = (Lenguaje) FactoryMateria.make(FactoryMateria.typeMateria.MATERIA_LENGUAJE);
        l1.setEstudiante(new Estudiante("Sofia", "Garcia", "008"));
        l1.crear();
    }
}
