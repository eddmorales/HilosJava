public class LosTresCochinitos  extends Thread{
    @Override
    public void run(){
    System.out.println("Mi PID es :" + this.getId());
}
public static void main(String[] args) {
        LosTresCochinitos cochinito1 = new LosTresCochinitos();
        cochinito1.start();
        LosTresCochinitos cochinito2 = new LosTresCochinitos();
        cochinito2.start();
        LosTresCochinitos cochinito3 = new LosTresCochinitos();
        cochinito3.start();
    } 
}
