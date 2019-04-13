import java.io.*;

public class Log {
    public Log(String nombreArchivo){
        File f;
        f = new File("archivoLog");

        //Escritura
        try {
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            wr.write();
            wr.append();

            wr.close();
            bw.close();
        }catch(IOException e){};
    }
}

}
