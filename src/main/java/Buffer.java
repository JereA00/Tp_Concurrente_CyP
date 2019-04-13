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

    public synchronized void agregar(Dato a){
        while(pila.size()==colaMax)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            pila.add(a);
            System.out.println("Agregado: "+a.getDato()+ " con espacio ocupado: "+ pila.size());
            notify();
        }
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
            }
            String dato_sacar = pila.poll().toString();
            System.out.println("Quitado:" + dato_sacar + "con espacio ocupado: " + pila.size());
            notify();
        }
    }
}