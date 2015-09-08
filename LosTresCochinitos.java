public class LosTresCochinitos{
    protected String nombre;
    public LosTresCochinitos(String nombre)
    {
        this.nombre = nombre;
    }
    public static void main(String[] args) 
    {
        LosTresCochinitosDistribuidos cochinos[] = new LosTresCochinitosDistribuidos[3];
        Thread hilos[] = new Thread[3];
        //cochinos[0] = new LosTresCochinitosDistribuidos("Hugo");
        hilos[0] = new Thread(new LosTresCochinitosDistribuidos("Hugo"));
        //cochinos[1] = new LosTresCochinitosDistribuidos("Paco");
        hilos[1] = new Thread(new LosTresCochinitosDistribuidos("Paco"));
        //cochinos[2] = new LosTresCochinitosDistribuidos("Luis");
        hilos[2] = new Thread(new LosTresCochinitosDistribuidos("Luis"));
        hilos[0].start();
        hilos[1].start();
        hilos[2].start();
    } 
}
