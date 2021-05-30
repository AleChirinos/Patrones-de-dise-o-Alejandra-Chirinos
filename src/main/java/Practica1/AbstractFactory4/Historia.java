package Practica1.AbstractFactory4;

public class Historia implements IMateria{
    private Estudiante estudiante;

    public Historia(){
        estudiante = new Estudiante("Alejandra", "", "");
    }

    @Override
    public void crear() {
        System.out.println("Estudiante de Historia:");
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
