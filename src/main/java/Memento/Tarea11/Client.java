package Memento.Tarea11;

public class Client {
    public static void main (String []argsss ){
        DataBase dataBase = new DataBase();
        Originator originator = new Originator();

        Person person1 = new Person("Pedro", 1245674, 20);
        originator.setState(person1);
        dataBase.createBackup("BackupMarzo",originator.createPerson());

        Person person2 = new Person("Jose", 3672651, 21);

        Person person3 = new Person("Angel", 12356743, 18);
        originator.setState(person3);
        dataBase.createBackup("BackupMayo",originator.createPerson());

        Person person4 = new Person("Francisco", 1237654, 22);

        Person person5 = new Person("Guillermo", 3627866, 26);
        originator.setState(person5);
        dataBase.createBackup("BackupJunio",originator.createPerson());

        Person person6 = new Person("Nicole", 1236534, 29);

        Person person7 = new Person("Victoria", 1231127, 28);
        originator.setState(person7);
        dataBase.createBackup("BackupJulio",originator.createPerson());

        Person person8 = new Person("Liliana", 5463345, 20);

        Person person9 = new Person("Adriana", 1267443, 18);
        originator.setState(person9);
        dataBase.createBackup("BackupAgosto",originator.createPerson());

        Person person10 = new Person("Paula", 3422155, 21);

        originator.restoreFromMemento(dataBase.getMemento("BackupMayo"));
    }
}
