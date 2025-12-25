import java.awt.*;
class Layout extends Frame{

    Panel ptop,upper,middle,btm;

    public Layout()
    {
        setTitle("My Panel");
        setSize(700,370);
        setBackground(Color.red);
        setLayout(null);
        setResizable(false);
        

        ptop = new Panel();
        ptop.setLayout(null);
        ptop.setBounds(15,50,670,305);
        ptop.setBackground(Color.green);
        add(ptop);
        

        upper = new Panel();
        upper.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
        upper.setBackground(Color.white);
        upper.setBounds(5,5,660,60);
        ptop.add(upper);
        


        





        setVisible(true);
    }
}

public class LayoutManage {
    public static void main(String [] args)
    {
        new Layout();
    }
}
