package Practica1.Iterator72clases;

import java.util.Vector;

public class EmpresaAvantica implements IEmpresa {
    private Vector<Empleado> empleados;

    public EmpresaAvantica(){
        empleados= new Vector<>();
    }
    public void add(Empleado value){
         empleados.add(value);
     }

    @Override
    public IteratorAvantica iterator() {
        return new IteratorAvantica(this.empleados);
    }
}
