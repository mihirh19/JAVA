package exp_8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class j2_cal extends Frame implements ActionListener {

    int n;
    TextField t1 = new TextField("",15);
    Button b0 = new Button("0");
    Button b1 = new Button("1");
    Button b2 = new Button("2");
    Button b3 = new Button("3");
    Button b4 = new Button("4");
    Button b5 = new Button("5");
    Button b6 = new Button("6");
    Button b7 = new Button("7");
    Button b8 = new Button("8");
    Button b9 = new Button("9");
    Button badd = new Button("+");
    Button bsub = new Button("-");
    Button bmul = new Button("*");
    Button bdiv = new Button("/");
    Button bcalc = new Button("=");
    Button bcl = new Button("C");
    Button bdot = new Button(".");

    GridBagLayout g1 = new GridBagLayout();
    GridBagConstraints gc = new GridBagConstraints();

    String s4,s5;

    j2_cal(){
        setSize(500,500);
        setVisible(true);
        setLayout(g1);

        gc.fill = GridBagConstraints.BOTH;
        gc.anchor = GridBagConstraints.WEST;

        add(t1, gc,0,0,5,1,0,0);
        add(bcl,gc,4,1,1,4,0,0);
        add(b7, gc,0,1,1,1,0,0);
        add(b8,gc,1,1,1,1,0,0);
        add(b9,gc,2,1,1,1,0,0);
        add(badd,gc,3,1,1,1,0,0);



        add(b4,gc,0,2,1,1,0,0);
        add(b5,gc,1,2,1,1,0,0);
        add(b6,gc,2,2,1,1,0,0);
        add(bsub,gc,3,2,1,1,0,0);

        add(b1,gc,0,3,1,1,0,0);
        add(b2,gc,1,3,1,1,0,0);
        add(b3,gc,2,3,1,1,0,0);
        add(bmul,gc,3,3,1,1,0,0);


        add(b0,gc,0,4,1,1,0,0);
        add(bdiv,gc,1,4,1,1,0,0);
        add(bcalc,gc,2,4,1,1,0,0);
        add(bdot,gc,3,4,1,1,0,0);




        b1.addActionListener(this);
        b0.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);

        bdiv.addActionListener(this);
        bcalc.addActionListener(this);
        bcl.addActionListener(this);

        bdot.addActionListener(this);



    }

    public void add(Component c , GridBagConstraints g, int x, int y, int w, int h, int wx, int wy){
        g.gridx = x;
        g.gridy = y;
        g.gridwidth = w;
        g.gridheight = h;
        g.weightx = wx;
        g.weighty = wy;

        g1.setConstraints(c,g);
        add(c);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==b0){
            String s1 = t1.getText();
            String s2 = "0";
            t1.setText(s1+s2);
        }
        if (e.getSource()==b1){
            String s1 = t1.getText();
            String s2 = "1";
            t1.setText(s1+s2);
        }
        if (e.getSource()==b2){
            String s1 = t1.getText();
            String s2 = "2";
            t1.setText(s1+s2);
        }
        if (e.getSource()==b3){
            String s1 = t1.getText();
            String s2 = "3";
            t1.setText(s1+s2);
        }
        if (e.getSource()==b4){
            String s1 = t1.getText();
            String s2 = "4";
            t1.setText(s1+s2);
        }
        if (e.getSource()==b5){
            String s1 = t1.getText();
            String s2 = "5";
            t1.setText(s1+s2);
        }
        if (e.getSource()==b6){
            String s1 = t1.getText();
            String s2 = "6";
            t1.setText(s1+s2);
        }
        if (e.getSource()==b7){
            String s1 = t1.getText();
            String s2 = "7";
            t1.setText(s1+s2);
        }
        if (e.getSource()==b8){
            String s1 = t1.getText();
            String s2 = "8";
            t1.setText(s1+s2);
        }
        if (e.getSource()==b9){
            String s1 = t1.getText();
            String s2 = "9";
            t1.setText(s1+s2);
        }
        if (e.getSource()==bdot){
            String s1 = t1.getText();
            String s2 = ".";
            t1.setText(s1+s2);
        }
        if (e.getSource()==badd){
            n=1;
            s4 = t1.getText();
            t1.setText("");
        }
        if (e.getSource()==bsub){
            n=2;
            s4 = t1.getText();
            t1.setText("");
        }
        if (e.getSource()==bmul){
            n=3;
            s4 = t1.getText();
            t1.setText("");
        }
        if (e.getSource()==bdiv){
            n=4;
            s4 = t1.getText();
            t1.setText("");
        }
        if (e.getSource()==bcl){
            t1.setText("");
        }

        if (e.getSource()==bcalc){
            s5 = t1.getText();
            if (n==1){
                Double a = Double.parseDouble(s4) + Double.parseDouble(s5);
                t1.setText(Double.toString(a));
            }
            if (n==2){
                Double a = Double.parseDouble(s4) - Double.parseDouble(s5);
                t1.setText(Double.toString(a));
            }
            if (n==3){
                Double a = Double.parseDouble(s4) * Double.parseDouble(s5);
                t1.setText(Double.toString(a));
            }
            if (n==4){
                Double a = Double.parseDouble(s4) / Double.parseDouble(s5);
                t1.setText(Double.toString(a));
            }
        }



    }

    public static void main(String[] args) {
        j2_cal n = new j2_cal();
    }
}
