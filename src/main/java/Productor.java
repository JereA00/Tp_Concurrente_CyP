public class Productor implements Runnable{

    private Buffer buffer;
    private final int CANT_A_PRODUCIR = 100;

    public Productor(Buffer buffer){ //crea un Producctor y le asigna un buffer
        this.buffer = buffer;
    }

    @Override
    public void run(){
        for(int i=0; i<CANT_A_PRODUCIR; i++){
            buffer.agregar();
        }
    }
}
