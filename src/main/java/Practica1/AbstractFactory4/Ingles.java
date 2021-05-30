package Practica1.AbstractFactory4;

public class Ingles implements IMateria{

    private Estudiante estudiante;

    public Ingles(){
        estudiante = new Estudiante("Alejandra", "", "");
    }

    @Override
    public void crear() {
        System.out.println("Estudiante de Ingles:");
        estudiante.showInfo();
        System.out.println("");
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
