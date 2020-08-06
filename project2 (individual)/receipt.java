import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.FileNotFoundException;
class receipt extends JFrame implements ActionListener{
private JScrollPane js;
private JTextArea jcomp1;
private JButton jcomp2;
    public receipt(String sn, String si, String ss, String se, String sc, String sd, int b)  {
        //construct components
        
        jcomp1 = new JTextArea (5, 5);
        jcomp2 = new JButton ("close");
        JScrollPane jt1_sp = new JScrollPane(jcomp1);
        //adjust size and set layout
        
        setPreferredSize (new Dimension (624, 334));
        setLayout (null);

        //add components
        
        add (jcomp2);
        add (jt1_sp);
        //set component bounds (only needed by Absolute Positioning)
        
        jt1_sp.setBounds (30, 30, 350, 220);
        jcomp2.setBounds (140, 275, 100, 25);
        
        jcomp2.addActionListener(this);
              String input = "name: "+ sn+"\n";
           input += "IC: " + si+"\n";
           input += "from: " + ss+" ";
           input += "untill: " + se+"\n";
           input += "court: " + sc+"\n";
           input += "date: " + sd+"\n";
           input += "total price: RM" + b + "." + "\n";
        jcomp1.setText(input);  
        setSize(500,400);
        setVisible(true);
        
    }
    public void actionPerformed (ActionEvent e)  {
     if((e.getSource()==jcomp2)){
         
         System.exit(0);
    }
}

}