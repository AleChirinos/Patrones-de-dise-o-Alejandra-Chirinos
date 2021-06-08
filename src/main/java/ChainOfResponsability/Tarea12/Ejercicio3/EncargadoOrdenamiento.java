package ChainOfResponsability.Tarea12.Ejercicio3;

public class EncargadoOrdenamiento implements IHandler {
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
    public void identificarAlgoritmo(ArregloPersonas person_arr) {
        SelectionSort selectionSort = new SelectionSort();
        this.setNext(selectionSort);

        BubbleSort bubbleSort = new BubbleSort();
        selectionSort.setNext(bubbleSort);

        InsertionSort insertionSort = new InsertionSort();
        bubbleSort.setNext(insertionSort);

        this.next.identificarAlgoritmo(person_arr);
    }
}
