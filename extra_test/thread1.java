public class thread1 extends Thread{
    String s1;
    thread1(String s){
        s1 =s;
    }
    @Override
    public void run() {
        while (true){
            System.out.println(s1);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new thread1("heelo");
        Thread t2 = new thread1("hi");

        t1.start();
        t2.start();
    }
}
