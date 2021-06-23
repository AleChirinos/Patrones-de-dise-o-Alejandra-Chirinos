package Bridge.EjercicioConBridge19;

public class Cliente {
    public static void main(String[] args){

        IPlataforma windows = new Windows(new Arquitecturax86());
        windows.arquitectura();

        IPlataforma linux = new Linux(new Arquitecturax86());
        linux.arquitectura();

        IPlataforma windows2 = new Windows(new Arquitecturax64());
        windows2.arquitectura();

        IPlataforma linux2 = new Linux(new Arquitecturax64());
        linux2.arquitectura();

    }
}
