package Prototype.Tarea3;

public class Cliente {
    public static void main (String []args){
        SamsungR10 celular = new SamsungR10();
        //celular.setTamaño("155,6 x 75,6 x 7,9 mm");
        celular.setCpu("Exynos 7884");
        celular.setMemoria("32");
        celular.setVersionAndroid("Android 9.0 Pie");
        celular.setCamara("13MP f/1.9");
        celular.setBluetooth("Si cuenta con bluethooth");
        celular.setCantidadDeMemoriasExternas("0");
        celular.setTipoDeBateria("3.400 mAh");
        celular.setSim(new Sim("x", "0"));
        celular.setAccesorios(new Accesorios("normales (con cable)", "original", "color negro"));

        SamsungR10 celular1= (SamsungR10) celular.clone();
        celular1.setCantidadDeMemoriasExternas("2");
        celular.setSim(new Sim("Viva", "78346577"));

        SamsungR10 celular2= (SamsungR10) celular.clone();
        celular2.setCantidadDeMemoriasExternas("1");
        celular2.setSim(new Sim("Entel", "64532788"));

        SamsungR10 celular3= (SamsungR10) celular.clone();
        celular3.setCantidadDeMemoriasExternas("3");
        celular3.setSim(new Sim("Tigo", "67789133"));

        celular1.showInformation();
        celular2.showInformation();
        celular3.showInformation();
    }
}
