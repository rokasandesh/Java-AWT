import java.awt.*;
public class MyFrame extends Frame {
    public MyFrame(){
        setTitle("Hello");
        setSize(200,300);
        setBackground(Color.BLACK);
        setVisible(true);
    }
}

class Demo
{
    public static void main(String[] args) {
        new MyFrame();
    }
}
