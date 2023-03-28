import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class mouseevent1 extends Frame implements MouseListener {
    mouseevent1(){
        setSize(500,500);
        setVisible(true);
        addMouseListener(this);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        setBackground(Color.red);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setBackground(Color.green);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setBackground(Color.blue);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        setBackground(Color.white);
    }


    public static void main(String[] args) {
        mouseevent1 m= new mouseevent1();
    }



}

