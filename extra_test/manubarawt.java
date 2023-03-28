import java.awt.*;

public class manubarawt  extends Frame {
    manubarawt(){
        setSize(500,500);
        setVisible(true);

        MenuBar mb = new MenuBar();
        Menu m= new Menu("file");
        MenuItem m1 = new MenuItem("new");
        MenuItem m2 = new MenuItem("file");
        MenuItem m3= new MenuItem("file");
        MenuItem m4 = new MenuItem("file");
        Menu p = new Menu("sub");

        p.add(m3);
        p.add(m4);

        mb.add(m);
        m.add(m1);
        m.add(m2);
        m.add(p);
        setMenuBar(mb);



    }

    public static void main(String[] args) {
        manubarawt m= new manubarawt();
    }
}
