public class threadgroup1 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        threadgroup1 t1  =new threadgroup1();

        ThreadGroup tg = new ThreadGroup("parent thread");

        Thread t2 = new Thread(tg,t1,"first");
        t2.start();

        Thread t3 =  new Thread(tg, t1, "second");
        t3.start();


        System.out.println(tg.getName());


    }
}
