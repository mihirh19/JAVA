import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyeventawt extends Frame implements KeyListener {
    int x =150;
    int y =150;
    char key;
    keyeventawt(){
        setSize(500,500);
        setVisible(true);
        addKeyListener(this);

    }

    @Override
    public void keyPressed(KeyEvent e) {
        key = e.getKeyChar();
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void paint(Graphics g) {
        g.drawString(String.valueOf(key), x,y);
    }


    public static void main(String[] args) {
        keyeventawt k =new keyeventawt();
    }
}
