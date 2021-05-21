package AbstractFactory.Tarea5;

public class Pasajero {
    private String nombre;
    private String ci;
    private String fechaDeNacimiento;

    public Pasajero(){}

    public Pasajero(String ci, String nombre, String fechaDeNacimiento){
        this.ci=ci;
        this.nombre=nombre;
        this.fechaDeNacimiento=fechaDeNacimiento;

    }
    public Pasajero(String ci, String nombre){
        this.ci=ci;
        this.nombre=nombre;
        this.fechaDeNacimiento="";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void showInfo(){
        System.out.println("Nombre del pasajero: "+ nombre);
        System.out.println("Carnet del pasajero: "+ ci);
        System.out.println("Fecha de nacimiento del pasajero: "+ fechaDeNacimiento);
    }
}
