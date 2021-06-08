package ChainOfResponsability.Tarea12.Ejercicio3;

public class Cliente {
    public static void main (String[] args) {
        EncargadoOrdenamiento encargado = new EncargadoOrdenamiento();

        Persona p01 = new Persona(1234567, "Sebastian", 15);
        Persona p02 = new Persona(4564324, "Camila", 54);
        Persona p03 = new Persona(3456733, "Cecilia", 32);
        Persona p04 = new Persona(5433657, "Ignacio", 64);
        Persona p05 = new Persona(9066532, "Alejandra", 34);
        Persona p06 = new Persona(2344444, "Daniela", 65);
        Persona p07 = new Persona(1254333, "Vitali", 32);
        Persona p08 = new Persona(7567677, "Tadeo", 21);
        Persona p09 = new Persona(1254233, "Freddy", 13);
        Persona p10 = new Persona(1255555, "Bernardo", 21);
        Persona p11 = new Persona(6543244, "Andre", 45);
        Persona p12 = new Persona(1245677, "Rodrigo", 65);
        Persona p13 = new Persona(1231212, "Sofia", 34);
        Persona p14 = new Persona(1233543, "Natalia", 33);
        Persona p15 = new Persona(3543534, "Rafael", 25);
        Persona p16 = new Persona(8756456, "Ernesto", 27);
        Persona p17 = new Persona(3453466, "Nicolas", 21);
        Persona p18 = new Persona(3455654, "Mauricio", 29);
        Persona p19 = new Persona(4235356, "Jorge", 30);
        Persona p20 = new Persona(4564544, "Mateo", 37);
        Persona p21 = new Persona(4563456, "matias", 50);
        Persona p22 = new Persona(3454564,"Melissa", 27);
        Persona p23 = new Persona(5464645, "Viacheslav", 43);
        Persona p24 = new Persona(6545344, "Sadko", 25);
        Persona p25 = new Persona(1234555, "Jhoseline", 63);
        Persona p26 = new Persona(2342455, "David", 63);
        Persona p27 = new Persona(2453565, "Darla", 34);
        Persona p28 = new Persona(2458978, "Dario", 24);
        Persona p29 = new Persona(2456778, "Jhoana", 35);
        Persona p30 = new Persona(1245668, "Rider", 56);
        Persona p31 = new Persona(7564534, "Gariela", 64);
        Persona p32 = new Persona(5646456, "Bary", 15);
        Persona p33 = new Persona(4564564, "Mauricio", 40);
        Persona p34 = new Persona(4534655, "Mauro", 34);
        Persona p35 = new Persona(5468884, "Maya", 25);
        Persona p36 = new Persona(4564553, "Guadalupe", 52);
        Persona p37 = new Persona(4567456, "Jesús", 56);
        Persona p38 = new Persona(4564532, "María", 64);
        Persona p39 = new Persona(2342454, "María José", 76);
        Persona p40 = new Persona(6785434, "José María", 86);
        Persona p41 = new Persona(3452389, "Susan", 23);
        Persona p42 = new Persona(2345657,"Patrick", 42);
        Persona p43 = new Persona(7567563, "Susana", 54);
        Persona p44 = new Persona(4564567, "Noelia", 14);
        Persona p45 = new Persona(4536457, "Noel", 13);
        Persona p46 = new Persona(6767565, "Mael", 3);
        Persona p47 = new Persona(3464675, "Joel", 42);
        Persona p48 = new Persona(5675786, "Thamiel", 42);
        Persona p49 = new Persona(5456756, "Rosa", 46);
        Persona p50 = new Persona(6756754, "Flora", 16);
        Persona p51 = new Persona(6786785, "Brayan 2", 27);

        Persona[] arr1 = {p01, p02, p03, p04};
        ArregloPersonas arrp1 = new ArregloPersonas("001", arr1);
        encargado.identificarAlgoritmo(arrp1);

        Persona[] arr2 = {p01, p02, p03, p04, p05, p06, p07, p08, p09, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21};
        ArregloPersonas arrp2 = new ArregloPersonas("arr-2", arr2);
        encargado.identificarAlgoritmo(arrp2);

        Persona[] arr3 = {p01, p02, p03, p04, p05, p06, p07, p08, p09, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50, p51};
        ArregloPersonas arrp3 = new ArregloPersonas("arr-3", arr3);
        encargado.identificarAlgoritmo(arrp3);
    }
}
