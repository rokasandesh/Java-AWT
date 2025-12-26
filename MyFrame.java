import java.awt.*;
class Demo extends Frame {

    Panel pmiddle,pmid;
    public Demo(){
        setTitle("Hello");
        setSize(700,500);
        setBackground(Color.BLACK);
        setLayout(new GridBagLayout());

        pmiddle = new Panel();
        pmiddle.setLayout(new GridBagLayout());
        pmiddle.setBackground(Color.white);
        pmiddle.setPreferredSize(new Dimension(70,70));
        add(pmiddle);

        pmid = new Panel();
        pmid.setBackground(Color.red);
        pmiddle.add(pmid);



        setVisible(true);
    }
}

public class MyFrame
{
    public static void main(String[] args) {
        new Demo();
    }
}
