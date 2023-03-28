package exp_4;
import java.util.Scanner;
/*
create a class shape derived class rectangle and circle from shape class
implement abstract method of shape class

shape class contain x and y as a data member display and area as abstract method.

circle class contain radius as data member
rectangle class contains length and width

use the concept of inheritance and overriding
 */

abstract class shape{
    int x,y;
    abstract void area();
    abstract void display();
}

class circle extends shape{
    void area(){
        double are = x*x*3.14;
        System.out.println("Area is  = " + are);
    }
    circle(int a){
        x = a;
        y = a;
    }

    void display(){
        System.out.println("circle");
    }
}


public class j2_abstractShape {
    static class rectangle extends shape{        // we make static for no object creation
        void area(){
            double are = x*y;
            System.out.println("area is = " + are);
        }

        rectangle(int a ,int b){
            x=a;
            y =b;
        }

        void display(){
            System.out.println("rectangle");
        }
    }

    public static void main(String[] args) {

        Scanner sc   = new Scanner(System.in);
        System.out.println("Enter the radias :");
        int r = sc.nextInt();
        shape s1 = new circle(r);


        System.out.println("Enter the length and width");
        int l  = sc.nextInt();
        int b = sc.nextInt();
        shape s2 = new rectangle(l,b);


        //rectangle se = new rectangle(45,33);
        s1.display();
        s1.area();

        s2.display();
        s2.area();
    }
}
