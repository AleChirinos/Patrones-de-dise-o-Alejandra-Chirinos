package Mediator.Tarea10;

public class Cliente {
    public static void main (String[] args){
        Skype skype= new Skype();

        DEV dev1 = new DEV(skype);
        dev1.setName("Rafael");
        dev1.setCi(1234567);
        dev1.setLenguaje("C++");

        DEV dev2 = new DEV(skype);
        dev2.setName("Rebeca");
        dev2.setCi(2345147);
        dev2.setLenguaje("Java");

        DEV dev3 = new DEV(skype);
        dev3.setName("Monica");
        dev3.setCi(12657423);
        dev3.setLenguaje("HTML");

        QA qa1 = new QA(skype);
        qa1.setName("Adriana");
        qa1.setCi(4567321);
        qa1.setGrado("Licenciada");

        QA qa2 = new QA(skype);
        qa2.setName("Sergio");
        qa2.setCi(6732457);
        qa2.setGrado("Magister");

        QA qa3 = new QA(skype);
        qa3.setName("Pablo");
        qa3.setCi(45678654);
        qa3.setGrado("PhD");

        SM sm1 = new SM(skype);
        sm1.setName("Natalia");
        sm1.setCi(4589654);
        sm1.setCertificaciones("1");

        SM sm2 = new SM(skype);
        sm2.setName("Isabel");
        sm2.setCi(7654765);
        sm2.setCertificaciones("2");

        SM sm3 = new SM(skype);
        sm3.setName("Bernardo");
        sm3.setCi(1234123);
        sm3.setCertificaciones("3");


        skype.addColleague(dev1);
        skype.addColleague(dev2);
        skype.addColleague(dev3);

        skype.addColleague(qa1);
        skype.addColleague(qa2);
        skype.addColleague(qa3);

        skype.addColleague(sm1);
        skype.addColleague(sm2);
        skype.addColleague(sm3);

        dev1.send("Este mensaje debe ser recibido por todos los DEVs");
        qa1.send("Este mensaje debe ser recibido por todos los QAs registrados");
        sm1.send("Este mensaje debe ser recibido por todos DEVs, QAs, SMs");
    }
}
