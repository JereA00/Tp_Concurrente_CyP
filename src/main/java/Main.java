import java.util.ArrayList;

public class Main{
    public static void Main(){
        Buffer buffer = new Buffer();
        ArrayList<Thread> hilosConsumidores;
        hilosConsumidores = new ArrayList<Thread>();


        for(int i=0; i<10; i++){
            Thread t = new Thread(new Productor(buffer));
            t.start();
        }

        for(int j=0; j<2; j++){
            hilosConsumidores.add(new Thread(new Consumidor(buffer)));
            hilosConsumidores.get(j).start();
        }
    }
}
