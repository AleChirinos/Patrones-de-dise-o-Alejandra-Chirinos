package Practica1.Prototype2;

import Prototype.Tarea3.SamsungR10;

public class ContratoDocente implements  IContrato {

    private String sueldo;
    private String cargaHoraria;
    private String cursoDeEducacionSuperior;
    private String accesoAlaPlataforma;
    private String marcadoBiometrico;
    private String marcadoHoradeEntrada;
    private String marcadoHoradeSalida;
    private String nombre;
    private String apellido;

    public ContratoDocente (){}

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getCursoDeEducacionSuperior() {
        return cursoDeEducacionSuperior;
    }

    public void setCursoDeEducacionSuperior(String cursoDeEducacionSuperior) {
        this.cursoDeEducacionSuperior = cursoDeEducacionSuperior;
    }

    public String getAccesoAlaPlataforma() {
        return accesoAlaPlataforma;
    }

    public void setAccesoAlaPlataforma(String accesoAlaPlataforma) {
        this.accesoAlaPlataforma = accesoAlaPlataforma;
    }

    public String getMarcadoBiometrico() {
        return marcadoBiometrico;
    }

    public void setMarcadoBiometrico(String marcadoBiometrico) {
        this.marcadoBiometrico = marcadoBiometrico;
    }

    public String getMarcadoHoradeEntrada() {
        return marcadoHoradeEntrada;
    }

    public void setMarcadoHoradeEntrada(String marcadoHoradeEntrada) {
        this.marcadoHoradeEntrada = marcadoHoradeEntrada;
    }

    public String getMarcadoHoradeSalida() {
        return marcadoHoradeSalida;
    }

    public void setMarcadoHoradeSalida(String marcadoHoradeSalida) {
        this.marcadoHoradeSalida = marcadoHoradeSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public Object clone() {
        ContratoDocente objClone = new ContratoDocente();
        objClone.setSueldo(this.sueldo);
        objClone.setCargaHoraria(this.cargaHoraria);
        objClone.setCursoDeEducacionSuperior(this.cursoDeEducacionSuperior);
        objClone.setMarcadoBiometrico(this.marcadoBiometrico);
        objClone.setAccesoAlaPlataforma(this.accesoAlaPlataforma);
        objClone.setMarcadoHoradeEntrada(this.marcadoHoradeEntrada);
        objClone.setMarcadoHoradeSalida(this.marcadoHoradeSalida);
        objClone.setNombre(this.nombre);
        objClone.setApellido(this.apellido);
        return objClone;
    }

    public void showInformation(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellido: "+ apellido);
        System.out.println("Marcado hora de entrada: "+ marcadoHoradeEntrada);
        System.out.println("Marcado hora de salida: "+marcadoHoradeSalida);
        System.out.println("Marcado biometrico: "+marcadoBiometrico);
        System.out.println("Acceso a la plataforma: "+ accesoAlaPlataforma);
        System.out.println("Curso de educación superior: "+ cursoDeEducacionSuperior);
        System.out.println("Carga horaria: "+ cargaHoraria);
        System.out.println("Sueldo: "+ sueldo);
        System.out.println("");
    }
}
