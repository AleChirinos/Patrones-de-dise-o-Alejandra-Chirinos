package Observer;

public class Client {

    public static void main (String []args){

        Telefonia telefonia = new Telefonia();

        UsuarioRegistrado user1= new UsuarioRegistrado(new Persona("1232544","Pedro"),"PRECIOS");
        UsuarioRegistrado user2= new UsuarioRegistrado(new Persona("5467567","Juan"),"PRECIOS");
        UsuarioRegistrado user3= new UsuarioRegistrado(new Persona("3564533","Jose"),"PROMOCIONES");
        UsuarioRegistrado user4= new UsuarioRegistrado(new Persona("6756444","Diego"),"PREMIOS");
        UsuarioRegistrado user5= new UsuarioRegistrado(new Persona("2353645","Pepe"),"NOTICIAS");


        telefonia.attach(user1);
        telefonia.attach(user2);
        telefonia.attach(user3);
        telefonia.attach(user4);
        telefonia.attach(user5);


        telefonia.uploadNewVideo(new Promociones("El nuevo costo es de 50 bs IMPERDIBLE","PRECIOS"));





    }
}
