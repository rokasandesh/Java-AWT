import java.awt.*;
class myframe extends Frame{
    Panel ptop,pbtm;
    public myframe(){
        ptop = new Panel();
        pbtm = new Panel();
        setSize(200,300);
        setLayout(null);
        
        
        ptop.setBackground(Color.RED);
        ptop.setBounds(50, 55, 190, 100);
        
        pbtm.setBounds(5, 80, 190, 20);
        pbtm.setBackground(Color.GREEN);
        add(ptop);
        add(pbtm);

        setVisible(true);
    }
}

public class PanelUse {
    public static void main(String[] args) {
        new myframe();
    }
}
