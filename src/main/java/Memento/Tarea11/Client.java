package Memento.Tarea11;

import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main (String []argsss ){
        DataBase dataBase = new DataBase();
        Originator originator = new Originator();

        Person person1 = new Person("Jose", 1345676, 18);
        Person person2 = new Person("Angel", 2432567, 20);
        Person person3 = new Person("Victoria", 2455333, 22);
        Person person4 = new Person("Teresa", 4522536, 24);
        Person person5 = new Person("Antonio", 2341127, 21);
        Person person6 = new Person("Maria", 4566328, 23);
        Person person7 = new Person("David", 1245661, 25);
        Person person8 = new Person("Juan", 1155432, 20);
        Person person9 = new Person("Javier", 1673323, 23);
        Person person10 = new Person("Lucia", 5433216, 27);
        Person person11 = new Person("Carlos", 1765547, 28);
        Person person12= new Person("Sara", 1987668, 30);
        Person person13 = new Person("Rafael", 2457761, 20);
        Person person14 = new Person("Pedro", 6433522, 21);
        Person person15 = new Person("Paula", 2435673, 18);

        List<Person> list1 = new LinkedList<Person>();
        list1.add(person1);
        list1.add(person2);
        list1.add(person3);

        List<Person> list2 = new LinkedList<Person>();
        list2.add(person4);
        list2.add(person5);
        list2.add(person6);

        List<Person> list3 = new LinkedList<Person>();
        list3.add(person7);
        list3.add(person8);
        list3.add(person9);

        List<Person> list4 = new LinkedList<Person>();
        list4.add(person10);
        list4.add(person11);
        list4.add(person12);

        List<Person> list5 = new LinkedList<Person>();
        list5.add(person13);
        list5.add(person14);
        list5.add(person15);

        BackUplist backUp;
        backUp= new BackUplist("BackupMarzo", list1);
        originator.setState(backUp);
        dataBase.addBackup(originator.createBackUp());

        backUp= new BackUplist("BackupMayo", list2);
        originator.setState(backUp);
        dataBase.addBackup(originator.createBackUp());

        backUp= new BackUplist("BackupJulio", list3);
        originator.setState(backUp);
        dataBase.addBackup(originator.createBackUp());

        backUp= new BackUplist("BackupSeptiembre", list4);
        originator.setState(backUp);
        dataBase.addBackup(originator.createBackUp());

        backUp= new BackUplist("BackupNoviembre", list5);
        originator.setState(backUp);
        dataBase.addBackup(originator.createBackUp());

        originator.restoreFromMemento(dataBase.getMemento(1));
    }
}
