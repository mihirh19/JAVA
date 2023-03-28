package exp_7;
import java.awt.*;
import java.awt.event.*;

/*
Implement a GUI based calculator application. It has two TextFields for two input
numbers, one TextField for result and four Buttons named Add, Sub, Mul and Div for
addition, subtraction, multiplication and division respectively.

 */
public class j1_calculator extends Frame implements ActionListener{
    Label l1 = new Label("Enter first number");
    Label l2 = new Label("Enter second number");
    Label l3 = new Label("answer");
    Label l4 = new Label();
    TextField t1 = new TextField();
    TextField t2 = new TextField();
    Button b1 = new Button("Addition");
    Button b2 = new Button("Substract");
    Button b3 = new Button("Multiplication");
    Button b4 = new Button("division");


    j1_calculator(){
        setSize(500,500);
        setVisible(true);
        setLayout(new GridLayout(5,2,10,10));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(l4);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        l4.setBackground(Color.GRAY);
        l4.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == b1) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());

                l4.setText(Integer.toString(a + b));
            }
            if (e.getSource() == b2) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());

                l4.setText(Integer.toString(a - b));
            }
            if (e.getSource() == b3) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());

                l4.setText(Integer.toString(a * b));
            }
            if (e.getSource() == b4) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());

                l4.setText(Double.toString(a * 1.0 / b));
            }
        }catch (Exception e1){
            System.out.println(e1);
        }
    }

    public static void main(String[] args) {
        new j1_calculator();
    }
}
