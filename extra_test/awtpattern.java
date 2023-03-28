import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class awtpattern extends Frame implements ActionListener {

    Button b = new Button("click");

    awtpattern(){
        setSize(500,500);
        setVisible(true);
        setBackground(Color.white);
        b.addActionListener(this);
        add(b);
        b.setBounds(20,20,50,50);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setBackground(Color.red);
    }

    public static void main(String[] args) {
        new awtpattern();
    }
}
