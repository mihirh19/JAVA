package exp_6;
import java.awt.*;

/*
 Write a program to display multiplication table in a Frame.
 */

public class j2_multiplicationgui extends Frame {
    j2_multiplicationgui(){
        setSize(800,600);
        setTitle("multiplication table");
        setMinimumSize(new Dimension(800, 700));
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <=10; j++) {
                String str = Integer.toString(i*j);
                g.setColor(Color.blue);
                g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
                g.drawString(str, (i*60), 50 + (j*50));
            }
        }
    }

    public static void main(String[] args) {
        Frame f1 = new j2_multiplicationgui();

        f1.repaint();
    }
}
