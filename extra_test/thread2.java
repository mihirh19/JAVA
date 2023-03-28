public class thread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <=10; i++) {
            System.out.println ("Run: " + i);
        }
    }

    public static void main(String[] args) {
        Thread t = new thread2();

        t.start();
        for (int i = 0; i <=10  ; i++) {
            System.out.println ("Main: " + i);
        }
    }
}
