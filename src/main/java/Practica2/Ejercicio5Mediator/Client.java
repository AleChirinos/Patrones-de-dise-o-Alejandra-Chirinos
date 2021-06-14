package Practica2.Ejercicio5Mediator;

import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        WhatsApp wap = new WhatsApp();

        User user1 = new UserReciever(wap, "Isabel");
        User user2 = new UserReciever(wap, "Adriana");

        //hacer la comunicación del usuario 1 al usuario 2 directamente

        user1.sendUser("Mensaje1", user2);
        System.out.println();

        User user3 = new UserReciever(wap, "Naomi");
        User user4 = new UserReciever(wap, "Natalia");
        User user5 = new UserReciever(wap, "Galia");
        User user6 = new UserReciever(wap, "Daniela");
        User user7 = new UserReciever(wap, "Andrea");
        User user8 = new UserReciever(wap, "Martina");
        User user9 = new UserReciever(wap, "Victoria");
        User user10 = new UserReciever(wap, "Sofia");

        List<User> lista1 = new LinkedList<User>();
        lista1.add(user1);
        lista1.add(user2);
        lista1.add(user3);
        lista1.add(user4);
        lista1.add(user5);
        lista1.add(user6);
        lista1.add(user7);
        lista1.add(user8);
        lista1.add(user9);
        lista1.add(user10);

        UserGroup grupo1 = new UserGroup("Gruop1");
        grupo1.setGrupo(lista1);
        wap.addGrupo(grupo1);

        //el usuario 10 que envie un mensaje a los otros usuarios
        user10.sendGroup("Mensaje2", grupo1.getNombre());

    }
}
