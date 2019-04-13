public class Dato {
    private Comida datoElegido;
    public Dato(){
        datoElegido = new Comida();
    }
    public String getDato(){
        return datoElegido.getComida();
    }

}