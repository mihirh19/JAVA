class Table{
    synchronized void printTable(int a){
        for (int i = 1; i <=10; i++) {
            System.out.println(i * a);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }

    }
}


class t1 extends Thread{
    Table t;
    t1(Table t){
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(2);
    }
}

public class syncronized_thread extends Thread {
    Table t;

    syncronized_thread(Table t){
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(10);
    }

    public static void main(String[] args) {
        Table obj = new Table();
        t1 m1 = new t1(obj);
        syncronized_thread m2 = new syncronized_thread(obj);

        m1.start();
        m2.start();
    }
}
