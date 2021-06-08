package ChainOfResponsability.Tarea12.Ejercicio3;

import java.util.Arrays;

public class SelectionSort implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        this.next=handler;
    }

    @Override
    public IHandler next() {
        return this.next;
    }

    @Override
    public void identificarAlgoritmo(ArregloPersonas person) {
        if (person.getData().length <= 20){
            System.out.println("Existen menos de 20 personas");
            System.out.println("Usaremos SELECTION SORT para ordenar a las personas");
            selectionSort(person);
            System.out.println();
        } else {
            this.next.identificarAlgoritmo(person);
        }
    }

    public void selectionSort(ArregloPersonas person){
        int n = person.getData().length;
        Persona[] ss_arr = Arrays.copyOf(person.getData(), n);
        // Límita el movimiento uno por uno del subarreglo sin clasificar
        for (int i = 0; i < n-1; i++) {
            // Encuentra el elemento mínimo en una matriz sin clasificar
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (ss_arr[j].getAge() < ss_arr[min_idx].getAge())
                    min_idx = j;
            // Intercambia el elemento mínimo encontrado con el primer
            // elemento
            Persona temp = ss_arr[min_idx];
            ss_arr[min_idx] = ss_arr[i];
            ss_arr[i] = temp;
        }
        printArray(ss_arr);
    }

    public void printArray(Persona[] ss_arr){
        for (Persona persona : ss_arr) {
            System.out.print("       " + persona.getAge() + "  ---  " + persona.getName() + "\n");
        }
        System.out.println();
    }
}