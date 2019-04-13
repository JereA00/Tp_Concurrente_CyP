import java.util.Queue;
import java.util.LinkedList;

public class Buffer {
    private int colaMax;
    private Queue<Dato> pila;

    public Buffer()
    {
        colaMax=10; //Tamaño de pila
        /*LinkedList implementa la cola para su funcionalidad y que asi se puedan sacar los archivos de arriba */
        pila = new LinkedList<Dato>();
    }

    public synchronized void agregar(){
        while(pila.size()==colaMax) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }}
            Dato a = new Dato();
            pila.add(a);
            System.out.println("Dato agregado: "+a.getDato()+ " espacio ocupado en pila actualmente: "+ pila.size());
            notify();
    }
    public synchronized void quitar() {
        while(pila.size()==0)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }}
            String dato_sacar = pila.poll().toString();
            System.out.println("Dato quitado:" + dato_sacar + " espacio ocupado en pila actualmente: " + pila.size());
            notify();
    }
}