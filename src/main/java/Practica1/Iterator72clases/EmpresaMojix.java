package Practica1.Iterator72clases;

import java.util.Stack;

public class EmpresaMojix implements IEmpresa {
    private Stack<Empleado> empleados;

    public EmpresaMojix(){
        empleados= new Stack<Empleado>();
    }
     public void add(Empleado value){
         empleados.add(value);
     }

    @Override
    public IteratorMojix iterator() {
        return new IteratorMojix(this.empleados);
    }
}
