package Practica2.Ejercicio1Memento;

public class TesisObject {
    private String title;
    private String theme;
    private String version;
    private int numberOfSheets;
    private int numberOfChanges;

    public TesisObject(String title, String theme, String version, int numberOfSheets, int numberOfChanges){
        this.title=title;
        this.theme=theme;
        this.version=version;
        this.numberOfSheets=numberOfSheets;
        this.numberOfChanges=numberOfChanges;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getNumberOfSheets() {
        return numberOfSheets;
    }

    public void setNumberOfSheets(int numberOfSheets) {
        this.numberOfSheets = numberOfSheets;
    }

    public int getNumberOfChanges() {
        return numberOfChanges;
    }

    public void setNumberOfChanges(int numberOfChanges) {
        this.numberOfChanges = numberOfChanges;
    }

    public void showInfo(){
        System.out.println("Titulo: "+title);
        System.out.println("Tema: "+theme);
        System.out.println("Version: "+version);
        System.out.println("Numero de hojas: "+numberOfSheets);
        System.out.println("Numero de cambios realizados: "+numberOfChanges);
    }
}
