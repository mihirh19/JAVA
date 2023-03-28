package exp_8;
/**  Write an application to simulate traffic lights. The program lets the user select one of
 the three lights red, yellow and green. Upon selecting a menu item, the light is turned
 on and there is only one light on at a time.  */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class j1_trafficlight extends Frame implements ActionListener {

    int t = 0;
    MenuBar mb = new MenuBar();
    Menu m = new Menu("lights");
    MenuItem m1 = new MenuItem("red");
    MenuItem m2 = new MenuItem("green");
    MenuItem m3 = new MenuItem("yellow");

    MenuItem re = new MenuItem("reset");

    j1_trafficlight(){
        setSize(500,500);
        setVisible(true);
        setMenuBar(mb);

        mb.add(m);
        setFont(new Font("timesroman", Font.PLAIN, 23));
        m.add(m1);
        m.add(m2);
        m.add(m3);
        m.add(re);

        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        re.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==m1){
                t=1;
                repaint();
        }
        else if (e.getSource()==m2){
            t=3;
            repaint();

        } else if (e.getSource()==m3) {
            t=2;
            repaint();

        }
        else if (e.getSource()==re){
            t=0;
            repaint();
        }


    }


    @Override
    public void paint(Graphics g) {
        g.drawOval(100,100,100,100);
        g.drawOval(100,300,100,100);
        g.drawOval(100,500,100,100);

        if (t==1){
            g.setColor(Color.RED);
            g.fillOval(100,100,100,100);
        }
        if (t==2){
            g.setColor(Color.yellow);
            g.fillOval(100,300,100,100);
        }
        if (t==3){
            g.setColor(Color.green);
            g.fillOval(100,500,100,100);
        }
    }

    public static void main(String[] args) {
        j1_trafficlight t = new j1_trafficlight();
    }

}
