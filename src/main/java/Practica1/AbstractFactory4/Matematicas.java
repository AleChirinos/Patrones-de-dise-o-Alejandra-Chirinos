package Practica1.AbstractFactory4;

public class Matematicas implements IMateria{
    private Estudiante estudiante;

    public Matematicas(){
        estudiante = new Estudiante("Alejandra", "", "");
    }
    @Override
    public void crear() {
        System.out.println("Estudiante de Matematicas:");
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
