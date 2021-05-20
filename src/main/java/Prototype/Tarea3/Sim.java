package Prototype.Tarea3;

public class Sim {
    private String nombreEmpresaTelefonica;
    private String numeroDeTelefono;

    public Sim(){}

    public Sim (String nombreEmpresaTelefonica, String numeroDeTelefono){
        this.nombreEmpresaTelefonica = nombreEmpresaTelefonica;
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public String getNombreEmpresaTelefonica() {
        return nombreEmpresaTelefonica;
    }

    public void setNombreEmpresaTelefonica(String nombreEmpresaTelefonica) {
        this.nombreEmpresaTelefonica = nombreEmpresaTelefonica;
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }
}
