class Th extends Thread{
    int total = 0;

    @Override
    public void run() {
        synchronized (this){
            System.out.println("child thread");

            for (int i = 0; i <=5; i++) {
                total += i;
            }
            System.out.println("child thread end");
            notify();
        }
    }
}


public class interthread {
    public static void main(String[] args) {
        Th b = new Th();
        b.start();

        synchronized (b){
            System.out.println("main thread call");
            try{
                b.wait();
            }catch (Exception e){
                System.out.println(e);
            }

            System.out.println("main thread notified");
            System.out.println("total = " + b.total);


        }
    }
}
