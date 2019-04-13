public class Main{
    public static void Main(){
        Buffer buffer = new Buffer();

        for(int i=0; i<10; i++){
            Thread t = new Thread(new Productor(buffer));
            t.start();
        }

        for(int j=0; j<2; j++){
            Thread t2 = new Thread(new Consumidor(buffer));
            t2.start();
        }
    }
}
