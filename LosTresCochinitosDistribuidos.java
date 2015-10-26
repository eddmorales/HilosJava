public class LosTresCochinitosDistribuidos extends LosTresCochinitos implements Runnable{
    private int pid;
    //this.pid = Thread.currentThread().getId();
    public LosTresCochinitosDistribuidos(String nombre){
        super(nombre);
        pid = 0;
    };
    public void run(){
    System.out.println("Mi nombre es " + this.nombre + ", mi PID es: " + Thread.currentThread().getId());
    //getId() obtiene el PID del hilo del objeto
    }
}