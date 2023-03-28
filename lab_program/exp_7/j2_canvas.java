package exp_7;

import java.awt.*;
import java.awt.event.*;

class can extends Canvas{
    int a=0;
    can(int t){
        setSize(300, 300);
        a = t;
        setBackground(Color.CYAN);
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void paint(Graphics g) {

        if(a==1){
            g.drawOval(50,50,200,200);
        }
        if (a==2){
            g.drawRect(50,50,200,200);


        }
        if (a==3){
            g.drawRoundRect(50,50,200,200,50,50);
        }
        if (a==4){
            g.drawOval(30,50,250,100);
        }
    }
}


public class j2_canvas extends Frame implements ItemListener {
    CheckboxGroup cg = new CheckboxGroup();
    Checkbox c1 = new Checkbox("circle",cg,false);
    Checkbox c2 = new Checkbox("square",cg,false);
    Checkbox c3 = new Checkbox("rounded square",cg,false);
    Checkbox c4 = new Checkbox("ellipse",cg,false);
    can c = new can(0);
    j2_canvas(){
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());
        setTitle("shape using canvas");
        setMinimumSize( new Dimension(500,500));
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);

        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource()==c1){
            c.setA(1);
        }
        if (e.getSource()==c2){
            c.setA(2);

        }
        if (e.getSource() == c3){
            c.setA(3);
        }
        if (e.getSource() == c4){
            c.setA(4);
        }
        if (e.getStateChange()==1){
            c.repaint();
        }
    }

    public static void main(String[] args) {
        j2_canvas c = new j2_canvas();
    }
}
