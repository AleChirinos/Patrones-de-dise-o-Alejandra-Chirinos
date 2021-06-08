package ChainOfResponsability.Tarea12.Ejercicio3;

import java.util.Arrays;

public class InsertionSort implements IHandler {
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
        if (person.getData().length > 50){
            System.out.println("Existen mas de 50 personas");
            System.out.println("Usaremos INSERTION SORT para ordenar a las personas");
            insertionSort(person);
            System.out.println();
        } else {
            System.out.println("ENTRADA ERRONEA");
        }
    }

    public void insertionSort(ArregloPersonas person_arr){
        int n = person_arr.getData().length;
        Persona[] is_arr = Arrays.copyOf(person_arr.getData(), n);
        for (int i = 1; i < n; i++) {
            Persona key = is_arr[i];
            int j = i - 1;
            while ((j >= 0) && (is_arr[j].getAge() > key.getAge())) {
                is_arr[j + 1] = is_arr[j];
                j--;
            }
            is_arr[j + 1] = key;
        }
        printArray(is_arr);
    }

    public void printArray(Persona[] is_arr){
        for (Persona persona : is_arr) {
            System.out.print("       " + persona.getAge() + "  ---  " + persona.getName() + "\n");
        }
        System.out.println();
    }
}
