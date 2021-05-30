package Practica1.Builder5;

public class Parrillada {
    private String TipoDeCarne;
    private String saborDeRefresco;
    private String Guarniciones;

    public Parrillada(){
    }

    public String getTipoDeCarne() {
        return TipoDeCarne;
    }

    public void setTipoDeCarne(String tipoDeCarne) {
        TipoDeCarne = tipoDeCarne;
    }

    public String getSaborDeRefresco() {
        return saborDeRefresco;
    }

    public void setSaborDeRefresco(String saborDeRefresco) {
        this.saborDeRefresco = saborDeRefresco;
    }

    public String getGuarniciones() {
        return Guarniciones;
    }

    public void setGuarniciones(String guarniciones) {
        Guarniciones = guarniciones;
    }

    public void showData() {
        System.out.println("Tipo de carne : "+ TipoDeCarne);
        System.out.println("Sabor del refreco : "+saborDeRefresco);
        System.out.println("Guarniciones : "+Guarniciones);
    }
}
