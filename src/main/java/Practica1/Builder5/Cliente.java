package Practica1.Builder5;

public class Cliente {
    public static void main(String[]args){
        Cocinero_Director chef= new Cocinero_Director();
        Bife bife = new Bife();
        Lomito lomito = new Lomito();
        Tira tira = new Tira();

        chef.setBuilderParrillada(bife);
        chef.armarParrillada();

        Parrillada parrillada1 = chef.getParrillada();
        parrillada1.showData();
        System.out.println("");

        chef.setBuilderParrillada(lomito);
        chef.armarParrillada();

        Parrillada parrllada2 = chef.getParrillada();
        parrllada2.showData();
        System.out.println("");

        chef.setBuilderParrillada(tira);
        chef.armarParrillada();

        Parrillada parrillada3 = chef.getParrillada();
        parrillada3.showData();
        System.out.println("");
    }
}
