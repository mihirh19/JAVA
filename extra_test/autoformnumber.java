

public class autoformnumber {

    static boolean isAuto(int n){
        int s = n*n;

        while (n>0){
            if (n%10!= s%10){     
                return false;
            }
            n = n/10;
            s = s/10;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAuto(76));
    }
}
