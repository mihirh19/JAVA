package exp_10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class j1_moving extends Frame implements ActionListener, Runnable{

    TextField t = new TextField();
    Choice c = new Choice();
    Button b = new Button("OK");
    int n=0;
    int x = 250;


    j1_moving(){
        setSize(500,500);
        setVisible(true);
        setLayout(null);

        t.setBounds(50,50,150,50);
        c.setBounds(250,50,100,100);
        b.setBounds(80,120,100,50);
        c.add("left");
        c.add("right");
        add(t);
        add(c);
        add(b);

        b.addActionListener(this);
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if (c.getSelectedItem().equals("right") && t.getText().equals("moved")){
            n=1;
            x = 250;
            Thread t = new Thread(this);

            t.start();
        }
        if(c.getSelectedItem().equals("left") && t.getText().equals("moved")){
            n=2;
            x = 250;
            Thread t = new Thread(this);
            t.start();
        }
        if (t.getText().equals("size")){
            n = 3;
            x = 250;
        }
        if (t.getText().equals("color")){
            n= 4;
            x = 250;

        }
    }

    @Override
    public void run() {
        if (n==1) {
            for (int i = 1; i <= 25; i++) {
                if (x<450) {
                    repaint();
                }
                try {
                    Thread.sleep(60);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        if (n==2) {
            for (int i = 25; i > 0; i--) {
                if (x > 10){
                    repaint();
                }
                try {
                    Thread.sleep(60);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        if (n==1){
            x = x+10;
            g.drawString("JAVA",x,250);
        }
        if (n==2){
            x = x-10;
            g.drawString("JAVA", x, 250);
        }
        if (n==3){
            g.setFont(new Font("timesroman", Font.PLAIN, 30));
            g.drawString("JAVA",x,250);
        }
        if (n==4){
            g.setColor(Color.red);
            g.drawString("JAVA", x,250);
        }
    }



    public static void main(String[] args) {
        j1_moving n = new j1_moving();
    }
}
