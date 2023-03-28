package exp_10;

import java.awt.*;
import  java.awt.event.*;

public class j2_moving_balls extends Frame implements Runnable {
    int x=100,y=50,t=1,te=1,t1=-1,te1=-1,t2=-1,te2=1,t3=1,te3=-1;
    int x1 = 500,y1=10,x2=100,y2=100,x3=250,y3=300;
    j2_moving_balls(){
        setSize(500,500);
        setVisible(true);
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        while (true){
            x = x + t;
            y = y + te;

            x1 =x1+t1;
            y1=y1+te1;
            x2 = x2 + t2;
            y2 = y2 + te2;
            x3 = x3 + t3;
            y3 =y3+te3;

            Dimension d= getSize();
            if (x<=0 || x>=d.width){
                t  = t*-1;
            }
            if (y<0 || y>=d.height){
                te = te*-1;
            }
            if (x1<0 || x1>=d.width){
                t1 = t1*-1;
            }
            if (y1<0 || y1>=d.height){
                te1 = te1*-1;
            }
            if (x2<0 || x2>=d.width){
                t2 = t2*-1;
            }
            if (y2<0 || y2>=d.height){
                te2= te2*-1;
            }
            if (x3<0 || x3>=d.width){
                t3 = t3*-1;
            }
            if (y3<0 || y3>=d.height){
                te3= te3*-1;
            }
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            repaint();

        }
    }

    @Override
    public void paint(Graphics g) {
        g.fillOval(x-70,y-70,70,70);
        g.fillOval(x1-70,y1-70,70,70);
        g.fillOval(x2-70,y2-70,70,70);
        g.fillOval(x3-70,y3-70,70,70);
    }

    public static void main(String[] args) {
        j2_moving_balls n = new j2_moving_balls();
    }
}