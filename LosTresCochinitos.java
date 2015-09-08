public class LosTresCochinitos  extends Thread{
    @Override
    public void run(){
    System.out.println("Mi PID es :" + this.getId());
    //getId() obtiene el PID del hilo del objeto
}
    private String nombre;
    private long pid;
    LosTresCochinitos(String nombre){
        this.nombre = nombre;
        this.pid = this.getId();
        System.out.println("Se ha construido el cochino " + this.nombre + ", su PID es: " + this.pid);
    }
public static void main(String[] args) {
        LosTresCochinitos cochinos[] = new LosTresCochinitos[3];
        cochinos[0] = new LosTresCochinitos("Hugo");
        cochinos[1] = new LosTresCochinitos("Paco");
        cochinos[2] = new LosTresCochinitos("Luis");
        cochinos[0].start();
        cochinos[1].start();
        cochinos[2].start();
    } 
}
