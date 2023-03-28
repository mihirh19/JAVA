//package exp_6;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
Write a program to display mouse position when the mouse is pressed.

 */

public class j1_mousePosition  extends Frame implements MouseListener {
    int x,y;
    j1_mousePosition(){
        addMouseListener(this);
        setSize(500,600);
        setTitle("mouse pressed check");
        setMinimumSize(new Dimension(400,300));
        setVisible(true);
    }


    public void mouseClicked(MouseEvent e){

    }
    public void mouseEntered(MouseEvent e){

    }
    public void mouseExited(MouseEvent e){

    }
    public void mousePressed(MouseEvent e){
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void mouseReleased(MouseEvent e){

    }


    @Override
    public void paint(Graphics g) {
        String s = " x = " + x + "  y = "+ y;
        g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
        g.drawString(s,100,100);
    }

    public static void main(String[] args) {
        j1_mousePosition s = new j1_mousePosition();
    }
}
