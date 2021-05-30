package Practica1.AbstractFactory4;

public class FactoryMateria {
    public enum typeMateria {
        MATERIA_HISTORIA, MATERIA_INGLES, MATERIA_LENGUAJE, MATERIA_MATEMATICAS
    }

    public static IMateria make(FactoryMateria.typeMateria type) {
        IMateria materia;
        switch (type) {
            case MATERIA_HISTORIA:
                materia = new Historia();
                ((Historia) materia).setEstudiante(new Estudiante("Alejandro", "Cors", "001"));
                break;
            case MATERIA_INGLES:
                materia = new Ingles();
                ((Ingles) materia).setEstudiante(new Estudiante("Sabrina", "Loayza", "002"));
                break;
            case MATERIA_LENGUAJE:
                materia = new Lenguaje();
                ((Lenguaje) materia).setEstudiante(new Estudiante("Nicolas", "Bonilla", "003"));
                break;
            case MATERIA_MATEMATICAS:
                materia = new Matematicas();
                ((Matematicas) materia).setEstudiante(new Estudiante("Sofia", "Garcia", "004"));
                break;
            default:
                materia = new Ingles();
                break;
        }
        return materia;
    }
}
