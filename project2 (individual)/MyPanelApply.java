import java.lang.String;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class MyPanelApply extends JFrame implements ActionListener {
    private JLabel jcomp1;
    public JTextArea jcomp2;
    private JLabel jcomp3;
    private JTextArea jcomp4;
    private JLabel jcomp5;
    private JComboBox start;
    private JComboBox end;
    private JLabel jcomp8;
    private JLabel jcomp9;
    private JTextField jcomp10;
    private JButton jcomp11;
    private JLabel jcomp12;
    private JComboBox jcomp13;

    public MyPanelApply(){
        //construct preComponents
        String[] startItems = {"6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"};
        String[] endItems = {"6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"};
        String[] jcomp13Items = {"[Select]", "futsal court (RM 80 per hour)", "badminton court (RM 50 per hour)", "basketball court (RM 60 per hour)", "takraw court (RM 40 per hour)"};

        //construct components
        jcomp1 = new JLabel ("name");
        jcomp2 = new JTextArea (5, 5);
        jcomp3 = new JLabel ("telephone number");
        jcomp4 = new JTextArea (5, 5);
        jcomp5 = new JLabel ("time");
        start = new JComboBox (startItems);
        end = new JComboBox (endItems);
        jcomp8 = new JLabel ("untill");
        jcomp9 = new JLabel ("date (dd/mm/yyyy)");
        jcomp10 = new JTextField (5);
        jcomp11 = new JButton ("apply");
        jcomp12 = new JLabel ("type court");
        jcomp13 = new JComboBox (jcomp13Items);

        //adjust size and set layout
        setPreferredSize (new Dimension (643, 458));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        add (start);
        add (end);
        add (jcomp8);
        add (jcomp9);
        add (jcomp10);
        add (jcomp11);
        add (jcomp12);
        add (jcomp13);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (40, 50, 100, 25);
        jcomp2.setBounds (170, 50, 280, 25);
        jcomp3.setBounds (40, 85, 100, 25);
        jcomp4.setBounds (170, 80, 280, 25);
        jcomp5.setBounds (40, 145, 100, 25);
        start.setBounds (170, 150, 100, 25);
        end.setBounds (335, 150, 100, 25);
        jcomp8.setBounds (290, 150, 60, 20);
        jcomp9.setBounds (40, 200, 120, 25);
        jcomp10.setBounds (170, 200, 100, 25);
        jcomp11.setBounds (245, 300, 100, 25);
        jcomp12.setBounds (40, 115, 100, 25);
        jcomp13.setBounds (170, 115, 100, 25);
        jcomp11.addActionListener(this);
        setSize(500,400);
        setVisible(true);
    }
    public void actionPerformed (ActionEvent e)  {
        if((e.getSource()==jcomp11)){
            court c = new court();
            
            
            c.getStart(start.getSelectedItem().toString(), end.getSelectedItem().toString());
            int tempHour = c.calcHour();
            String tHour = Integer.toString(tempHour);
            
            String storename = jcomp2.getText().toString();
            String storenumber = jcomp4.getText();
            String storeStart = start.getSelectedItem().toString();
            String storeEnd = end.getSelectedItem().toString();
            String storeCourt = jcomp13.getSelectedItem().toString();
            String storeDate = jcomp10.getText();
            
            
            
            calculateBill cb = new calculateBill();
            cb.getType(storeCourt, tempHour);
            int bill = cb.type();
            writetofile wr = new writetofile();
            wr.write(storename, storenumber, storeStart, storeEnd, storeCourt, storeDate, bill);
            dispose();
            new receipt(storename,storenumber, storeStart, storeEnd, storeCourt, storeDate, bill);
            
            
                       
                  
           
          
            
            

    }
  
    }
        
}
         