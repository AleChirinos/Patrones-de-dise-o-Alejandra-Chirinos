package Bridge.EjercicioConBridge19;

public class Windows implements IPlataforma{
    IArquitectura arquitectura;
    public Windows(IArquitectura arquitectura){
        this.arquitectura=arquitectura;
    }
    @Override
    public void color() {
        System.out.println("negro");
    }

    @Override
    public void arquitectura() {
        System.out.println("Obteniendo tipo de arquitectura de Linux...");
        arquitectura.tipoArquitectura();
    }
}
