package Memento.Tarea11;

public class Person {
    private String name;
    private int ci;
    private int age;

    public Person (String name, int ci, int age){
        this.name=name;
        this.ci=ci;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info(){
        System.out.println("Name: "+name);
        System.out.println("CI: "+ci);
        System.out.println("Age: "+age);
        System.out.println();
    }
}
