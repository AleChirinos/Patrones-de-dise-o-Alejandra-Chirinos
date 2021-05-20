package Prototype.Tarea3;

public class SamsungR10 implements CaracteristicasDeCelular{
    //private String tamaño;
    private String cpu;
    private String memoria;
    private String versionAndroid;
    private String camara;
    private String bluetooth;
    private String cantidadDeMemoriasExternas;
    private String tipoDeBateria;
    private Sim sim;
    private Accesorios accesorios;

    public SamsungR10(){}

    //public String getTamaño() {
    //    return tamaño;
    //}

    //public void setTamaño(String tamaño) {
    //    this.tamaño = tamaño;
    //}

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(String versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getCantidadDeMemoriasExternas() {
        return cantidadDeMemoriasExternas;
    }

    public void setCantidadDeMemoriasExternas(String cantidadDeMemoriasExternas) {
        this.cantidadDeMemoriasExternas = cantidadDeMemoriasExternas;
    }

    public String getTipoDeBateria() {
        return tipoDeBateria;
    }

    public void setTipoDeBateria(String tipoDeBateria) {
        this.tipoDeBateria = tipoDeBateria;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    public Accesorios getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(Accesorios accesorios) {
        this.accesorios = accesorios;
    }

    @Override
    public Object clone() {
        SamsungR10 objClone = new SamsungR10();
        objClone.setBluetooth(this.bluetooth);
        objClone.setCamara(this.camara);
        objClone.setCpu(this.cpu);
        objClone.setMemoria(this.memoria);
        objClone.setCantidadDeMemoriasExternas(this.cantidadDeMemoriasExternas);
        objClone.setTipoDeBateria(this.tipoDeBateria);
        objClone.setVersionAndroid(this.versionAndroid);
        //objClone.setTamaño(this.tamaño);
        objClone.setSim(this.sim); // profundo
        objClone.accesorios= this.accesorios; //superficial
        return objClone;
    }

    public void showInformation(){
        System.out.println("Caracteristicas celular Samsung R10");
        System.out.println("");
        //System.out.println("Tamaño: "+ tamaño + " HD+");
        System.out.println("Procesador: "+ cpu);
        System.out.println("Memoria: "+ memoria + " GB");
        System.out.println("Version de Android: "+ versionAndroid);
        System.out.println("Camara: "+camara);
        System.out.println("Bluetooth: "+bluetooth);
        System.out.println("Cantidad de memorias externas: "+ cantidadDeMemoriasExternas);
        System.out.println("Tipo de bateria: "+ tipoDeBateria);
        System.out.println("Nombre de la empresa telefonica :"+ sim.getNombreEmpresaTelefonica());
        System.out.println("Número de telefono: "+ sim.getNumeroDeTelefono());
        System.out.println("Audifonos: " + accesorios.getAudifonos());
        System.out.println("Cargador: " + accesorios.getCargador());
        System.out.println("Estuche: "+ accesorios.getEstuche());
        System.out.println("");
        System.out.println("");
    }
}
