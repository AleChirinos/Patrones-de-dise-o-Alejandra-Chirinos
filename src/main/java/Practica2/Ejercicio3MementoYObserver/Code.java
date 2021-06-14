package Practica2.Ejercicio3MementoYObserver;

public class Code {
    private String code;
    private String lenguage;
    private int version;

    public Code(String code, String lenguage, int version){
        this.code=code;
        this.lenguage=lenguage;
        this.version=version;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLenguage() {
        return lenguage;
    }

    public void setLenguage(String lenguage) {
        this.lenguage = lenguage;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void showInfo(){
        System.out.println("Lenguaje: "+lenguage);
        System.out.println("Codigo: "+code);
        System.out.println("Version: "+version);
        System.out.println();
    }
}
