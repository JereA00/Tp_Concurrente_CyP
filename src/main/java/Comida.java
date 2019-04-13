import java.util.ArrayList;


public class Comida {
    private ArrayList<String> listaComidas;
    private String comidaAleatoria;
    public Comida(){
        listaComidas = new ArrayList<String>();
        this.agregarElementos();
        comidaAleatoria = this.elegirComida(listaComidas);

    }
    public void agregarElementos(){
        listaComidas.add("pancho");
        listaComidas.add("arroz");
        listaComidas.add("carne");
        listaComidas.add("polenta");
        listaComidas.add("fideos");
        listaComidas.add("ensalada");
        listaComidas.add("milanesa");
        listaComidas.add("ravioles");
        listaComidas.add("guiso");
        listaComidas.add("hamburguesa");
        listaComidas.add("pizza");
    }
    public String elegirComida(ArrayList<String> c){
        return c.get((int)(Math.random()*11));
    }
    public String getComida(){
        return comidaAleatoria;
    }
}