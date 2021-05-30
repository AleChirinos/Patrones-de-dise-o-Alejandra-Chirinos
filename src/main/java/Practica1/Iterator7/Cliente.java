package Practica1.Iterator7;

public class Cliente {
    public static void main (String[] args){
        Bussiness1 bussiness1 = new Bussiness1();
        bussiness1.add("Juan");
        bussiness1.add("Liberto");
        bussiness1.add("Ana");
        bussiness1.add("Patty");
        bussiness1.add("Isabel");

        Bussiness2 bussiness2 = new Bussiness2();
        bussiness2.add("Daniel");
        bussiness2.add("Rene");
        bussiness2.add("Luisa");
        bussiness2.add("Dora");
        bussiness2.add("Ines");

        Bussiness3 bussiness3 = new Bussiness3();
        bussiness3.add("Pedro");
        bussiness3.add("Carlos");
        bussiness3.add("Rosario");
        bussiness3.add("Mario");
        bussiness3.add("Hernan");

        Bussiness4 bussiness4 = new Bussiness4();
        bussiness4.add("Gonzalo");
        bussiness4.add("Grecia");
        bussiness4.add("Nicolas");
        bussiness4.add("Samuel");
        bussiness4.add("Ignacio");

        System.out.println("Empresa 1:");
        Iterator iterator = bussiness1.iterator();
        while (iterator.hasNext()){
            System.out.println("Nombre: "+iterator.next());
        }
        System.out.println("");

        System.out.println("Empresa 2:");
        iterator = bussiness2.iterator();
        while (iterator.hasNext()){
            System.out.println("Nombre: "+iterator.next());
        }
        System.out.println("");

        System.out.println("Empresa 3:");
        iterator = bussiness3.iterator();
        while (iterator.hasNext()){
            System.out.println("Nombre: "+iterator.next());
        }
        System.out.println("");

        System.out.println("Empresa 4:");
        iterator = bussiness4.iterator();
        while (iterator.hasNext()){
            System.out.println("Nombre: "+iterator.next());
        }
    }
}
