import java.awt.*;

public class squareawt extends Frame {
    squareawt(){
        setSize(500,500);
        setVisible(true);


    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(150,150,200,200);
        g.drawOval(150,150,200,200);
        g.drawLine(150,150,350,350);
    }

    public static void main(String[] args) {
        squareawt a = new squareawt();
    }
}
