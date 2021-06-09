package Observer;

public class Promociones {
    private String categoria;
    private String descripcion;

    public Promociones(String descripcion, String categoria){
        this.descripcion=descripcion;
        this.categoria= categoria;
    }

    public void info(){
        System.out.println("INFO > categoria: ["+categoria+"]");
        System.out.println("INFO > descripcion: "+descripcion);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
