import java.awt .*;

class Demo extends Frame
{
         Button btn_OK;
         MenuBar mb;
         Menu mFile,mFont,mColor;
         MenuItem miNew,miClose,miSeparator1;
         MenuItem miFont1,miSeparator2,miFont2,miFont3,miSeparator3;
         MenuItem miRed,miSeparator4,miGreen;
         Panel pTop;
         Panel pMiddle;
         Panel upper;
         Panel pBottom;
         Panel pGender;
         Panel pMarital;
         Label lbl_maritalstatus;
         Label lblcmt;
         Label lblhoby;
         Label lbl_name;
         Label lbl_lastname;
         Label lbl_Gender;
         Choice ch;
         CheckboxGroup cgGender;
         CheckboxGroup cgMarital;

         Checkbox cb_male;
         Checkbox cb_female;
         Checkbox married;
         Checkbox unmarried;
         Checkbox cb_sing,cb_dance,cb_eat,cb_study;
         TextField txtname;
         TextField txtln;
         TextArea txtcmt;
         Font fon=new Font("Arial",Font.BOLD,11);
         Font fon1 = new Font("Arial",Font.ITALIC,11);
         Font fonO  = new Font("Arial",Font.PLAIN,11);

         public Demo() {
             super("This is my first Frame");
             setSize(700, 350);
             setLocationRelativeTo(null);
             setResizable(false);
             setBackground(Color.RED);

             setLayout(null);
             setCursor(new Cursor(Cursor.HAND_CURSOR));
             mb = new MenuBar();
             setMenuBar(mb);
             mFile = new Menu("File");
             mFont = new Menu("Font");
             mColor = new Menu("Color");
             mb.add(mFile);
             mb.add(mFont);
             mb.add(mColor);
             miNew = new MenuItem("New");
             miSeparator1 = new MenuItem("-");
             miClose = new MenuItem("Close");
             mFile.add(miNew);
             mFile.add(miSeparator1);
             mFile.add(miClose);
             miFont1 = new MenuItem("Arial -Bold");
             miSeparator2 = new MenuItem("-");
             miFont2 = new MenuItem("Arial-Italic");
             miFont3 = new MenuItem("Arial-Normal");
             miSeparator3 = new MenuItem("-");
             mFont.add(miFont1);
             mFont.add(miSeparator2);
             mFont.add(miFont2);
             mFont.add(miSeparator3);
             mFont.add(miFont3);
             miRed = new MenuItem("Red");
             miSeparator4 = new MenuItem("-");
             miGreen = new MenuItem("Green");
             mColor.add(miRed);
             mColor.add(miSeparator4);

             mColor.add(miGreen);

             pTop = new Panel();
             pTop.setLayout(null);
             pTop.setBounds(10, 50, 680, 290);
             pTop.setBackground(Color.GREEN);

             upper = new Panel();
             upper.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
             upper.setBackground(Color.WHITE);
             upper.setBounds(5, 5, 670, 30);
             ch = new Choice();
             ch.addItem("Choose");
             ch.addItem("MR");
             ch.addItem("Miss");
             ch.addItem("Mrs");

             lbl_name = new Label("First Name");
             lbl_name.setFont(fon);
             txtname = new TextField(27);

             lbl_lastname = new Label("Last Name");
             lbl_lastname.setFont(fon);
             txtln = new TextField(27);

             lbl_lastname = new Label("Last Name");
             lbl_lastname.setFont(fon);
             txtln = new TextField(27);

             upper.add(ch);
             upper.add(lbl_name);
             upper.add(txtname);
             upper.add(lbl_lastname);
             upper.add(txtln);
             pTop.add(upper);

             pGender = new Panel();
             pGender.setBounds(5, 35, 670, 30);
             pGender.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
             pGender.setBackground(Color.WHITE);
             lbl_Gender = new Label("Gender");

             cgGender = new CheckboxGroup();
             cgMarital = new CheckboxGroup();

             cb_male = new Checkbox("Male", false, cgGender);
             cb_male.setEnabled(true);
             cb_female = new Checkbox("Female", false, cgGender);
             cb_female.setEnabled(true);

             pGender.add(lbl_Gender);
             pGender.add(cb_male);
             pGender.add(cb_female);
             pTop.add(pGender);

             pMarital = new Panel();

             pMarital.setBounds(5, 65, 670, 30);
             pMarital.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
             pMarital.setBackground(Color.WHITE);
             lbl_maritalstatus = new Label("Marital Status");

             married = new Checkbox("Married", false, cgMarital);
             married.setEnabled(true); //for disabling the checkbox
             unmarried = new Checkbox("Unmmarried", false, cgMarital);
             unmarried.setEnabled(true);

             pMarital.add(lbl_maritalstatus);
             pMarital.add(married);
             pMarital.add(unmarried);
             pTop.add(pMarital);

             pMiddle = new Panel();
             pMiddle.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
             pMiddle.setBounds(5, 90, 670, 30);
             pMiddle.setBackground(Color.RED);
             lblhoby = new Label("Hobbies");
             lblhoby.setForeground(Color.WHITE);
             pMiddle.add(lblhoby);

             cb_sing = new Checkbox("Singing");
             cb_eat = new Checkbox("Eating");
             cb_dance = new Checkbox("Dancing");
             cb_study = new Checkbox("Studying");

             pMiddle.add(cb_sing);
             pMiddle.add(cb_eat);
             pMiddle.add(cb_dance);
             pMiddle.add(cb_study);
             pTop.add(pMiddle);

             pBottom = new Panel();
             pBottom.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
             pBottom.setBounds(5, 130, 670, 100);
             pBottom.setBackground(Color.WHITE);
             lblcmt = new Label("Comment");
             pBottom.add(lblcmt);
             txtcmt = new TextArea(4, 80);
             pBottom.add(txtcmt);
             pTop.add(pBottom);

             btn_OK = new Button("OK");
             btn_OK.setBounds(300, 250, 50, 20);
             pTop.add(btn_OK);
             add(pTop);
             setVisible(true);
        }
}
public class registration{
            public  static void main (String[] args) {
             new Demo();
            }

         }
