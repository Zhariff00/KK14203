import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.swing.JOptionPane;
import java.io.FileReader;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
class read extends JFrame implements ActionListener{
    private JTextArea jcomp1;
    private JButton jcomp2;
    public read () {
    jcomp1 = new JTextArea (5, 5);
    jcomp2 = new JButton ("close");
    JScrollPane jt1_sp = new JScrollPane(jcomp1);
    //adjust size and set layout
        setPreferredSize (new Dimension (624, 334));
        setLayout (null);

        //add components
        add (jt1_sp);
        add (jcomp2);
        
         jcomp2.addActionListener(this);
        //set component bounds (only needed by Absolute Positioning)
        jt1_sp.setBounds (30, 30, 350, 220);
        jcomp2.setBounds (140, 275, 100, 25);
        setSize(500,400);
        setVisible(true);
        
        try{File file = new File("projek.txt");
            Scanner sc = new Scanner (file);
            String data = " ";
            while(sc.hasNextLine()){
                
                String temp=sc.nextLine()+"\n";
                data = data +temp;
            }
            jcomp1.setText(data);
        }catch(Exception e){
        
    }
}
    public void actionPerformed (ActionEvent e)  {
        if((e.getSource()==jcomp2)){
         
        System.exit(0);
    }
}
   
}
