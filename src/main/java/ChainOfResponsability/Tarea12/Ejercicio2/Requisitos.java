package ChainOfResponsability.Tarea12.Ejercicio2;

public class Requisitos {
    private boolean certificadodenacimiento;
    private boolean pagoAlbanco;
    private boolean ficha;

    public Requisitos(boolean certificadodenacimiento, boolean pagoAlbanco, boolean ficha){
        this.certificadodenacimiento=certificadodenacimiento;
        this.pagoAlbanco=pagoAlbanco;
        this.ficha=ficha;
    }

    public boolean isCertificadodenacimiento() {
        return certificadodenacimiento;
    }

    public void setCertificadodenacimiento(boolean certificadodenacimiento) {
        this.certificadodenacimiento = certificadodenacimiento;
    }

    public boolean isPagoAlbanco() {
        return pagoAlbanco;
    }

    public void setPagoAlbanco(boolean pagoAlbanco) {
        this.pagoAlbanco = pagoAlbanco;
    }

    public boolean isFicha() {
        return ficha;
    }

    public void setFicha(boolean ficha) {
        this.ficha = ficha;
    }
}
