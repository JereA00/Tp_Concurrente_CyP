public class Consumidor implements Runnable{
    private Buffer buffer;
    private final int CANT_A_CONSUMIR = 100;

    public Consumidor(Buffer buffer){ //crea un Consumidor y le asigna un buffer
        this.buffer = buffer;
    }

    @Override
    public void run(){
        for(int i=0; i<CANT_A_CONSUMIR; i++){
            buffer.quitar();
        }
    }

}
