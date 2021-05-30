package Practica1.AbstractFactory4;

public class Lenguaje implements IMateria{
    private Estudiante estudiante;

    public Lenguaje(){
        estudiante = new Estudiante("Alejandra", "", "");
    }

    @Override
    public void crear() {
        System.out.println("Estudiante de Lenguaje:");
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
