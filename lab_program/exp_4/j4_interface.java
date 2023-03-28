package exp_4;


interface add{
    void addition(int a, int b);
}

interface sub{
    void substract(int a, int b);
}


class opera implements add, sub{
    public void addition(int a, int b){

        System.out.println("sum is = " + (a+b));
    }

    public void substract(int a, int b){

        System.out.println("sub is  = " + (a-b));
    }
}


public class j4_interface {
    public static void main(String[] args) {
        opera o1 = new opera();

        o1.addition(5,9);
        o1.substract(8,2);
    }
}
