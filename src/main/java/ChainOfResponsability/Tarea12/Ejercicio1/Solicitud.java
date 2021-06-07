package ChainOfResponsability.Tarea12.Ejercicio1;

public class Solicitud {
    private boolean infrestructura=false;
    private boolean bug=false;
    private boolean mejora=false;
    private boolean funcionalidad=false;
    private boolean costos=false;
    private boolean otro=false;

    public Solicitud(boolean infrestructura, boolean bug, boolean mejora, boolean funcionalidad, boolean costos, boolean otro){
       this.infrestructura=infrestructura;
       this.bug=bug;
       this.mejora=mejora;
       this.funcionalidad=funcionalidad;
       this.costos=costos;
       this.otro=otro;
    }

    public boolean isInfrestructura() {
        return infrestructura;
    }

    public void setInfrestructura(boolean infrestructura) {
        this.infrestructura = infrestructura;
    }

    public boolean isBug() {
        return bug;
    }

    public void setBug(boolean bug) {
        this.bug = bug;
    }

    public boolean isMejora() {
        return mejora;
    }

    public void setMejora(boolean mejora) {
        this.mejora = mejora;
    }

    public boolean isFuncionalidad() {
        return funcionalidad;
    }

    public void setFuncionalidad(boolean funcionalidad) {
        this.funcionalidad = funcionalidad;
    }

    public boolean isCostos() {
        return costos;
    }

    public void setCostos(boolean costos) {
        this.costos = costos;
    }

    public boolean isOtro() {
        return otro;
    }

    public void setOtro(boolean otro) {
        this.otro = otro;
    }
}
