package ChainOfResponsability.Tarea12.Ejercicio3;

import java.util.Arrays;

public class BubbleSort implements IHandler {
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
        if (person.getData().length > 20  && person.getData().length <= 50){
            System.out.println("Existen entre 20 y 50 personas");
            System.out.println("Usaremos BUBBLE SORT para ordenar a las personas");
            bubbleSort(person);
            System.out.println();
        } else {
            this.next.identificarAlgoritmo(person);
        }
    }

    public void bubbleSort(ArregloPersonas person) {
        int n = person.getData().length;
        Persona[] bs_arr = Arrays.copyOf(person.getData(), n);
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++){
                if (bs_arr[j].getAge() > bs_arr[j+1].getAge()) {
                    // swap arr[j+1] and arr[j]
                    Persona temp = bs_arr[j];
                    bs_arr[j] = bs_arr[j+1];
                    bs_arr[j+1] = temp;
                }
            }
        }
        printArray(bs_arr);
    }

    public void printArray(Persona[] ss_arr){
        for (Persona persona : ss_arr) {
            System.out.print("       " + persona.getAge() + "  ---  " + persona.getName() + "\n");
        }
        System.out.println();
    }
}
