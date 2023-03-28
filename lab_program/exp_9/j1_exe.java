package exp_9;

import java.awt.*;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class j1_exe extends Frame implements ActionListener {

    TextField t1 = new TextField();
    TextField t2 = new TextField();
    int arr[];
    Button b = new Button("show");

    Random r= new Random();
    j1_exe(){

        arr = new int[100];


        for (int i = 0; i <arr.length ; i++) {
            arr[i] = r.nextInt();
        }


        setSize(500,500);
        setVisible(true);
        setLayout(new GridLayout(2,2));


        add(t1);
        add(t2);
        add(b);

        b.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
     try {
         int x= Integer.parseInt(t1.getText());
         t2.setText(Integer.toString(arr[x]));
     }catch (Exception e1){
         t2.setText("out of bound");
     }
    }


    public static void main(String[] args) {
        j1_exe n = new j1_exe();
    }
}
