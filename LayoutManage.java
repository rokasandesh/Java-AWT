import java.awt.*;
class Layout extends Frame{

    Panel ptop,upper,middle,btm;
    MenuBar mb;
    Menu mFile,mEdit,mColor;
    MenuItem miNew,miClose,miSeperate1;
    MenuItem miUndo,miSeperate2,miCopy,miSeperate3,miPaste;
    MenuItem miRed,miSeperate4,miGreen;

    public Layout()
    {
        setTitle("My Panel");
        setSize(700,370);
        setBackground(Color.red);
        setLayout(null);
        setResizable(false);

        mb = new MenuBar();

        mFile = new Menu("File");
        mEdit = new Menu("Edit");
        mColor = new Menu("Color");

        mb.add(mFile);
        mb.add(mEdit);
        mb.add(mColor);

        miNew = new MenuItem("New");
        miSeperate1 = new MenuItem("-");
        miClose = new MenuItem("Close");

        mFile.add(miNew);
        mFile.add(miSeperate1);
        mFile.add(miClose);

        miUndo = new MenuItem("Undo");
        miSeperate2 = new MenuItem("-");
        miCopy = new MenuItem("Copy");
        miSeperate3 = new MenuItem("-");
        miPaste = new MenuItem("Paste");

        mEdit.add(miUndo);
        mEdit.add(miSeperate2);
        mEdit.add(miCopy);
        mEdit.add(miSeperate3);
        mEdit.add(miPaste);

        setMenuBar(mb);
        
        
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

        middle = new Panel();
        middle.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
        middle.setBackground(Color.red);
        middle.setBounds(5,70,660,40);
        ptop.add(middle);

        btm= new Panel();
        btm.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
        btm.setBackground(Color.white);
        btm.setBounds(5,115,660,70);
        ptop.add(btm);
        


        





        setVisible(true);
    }
}

public class LayoutManage {
    public static void main(String [] args)
    {
        new Layout();
    }
}
