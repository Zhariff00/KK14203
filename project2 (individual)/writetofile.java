import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.swing.JOptionPane;
class writetofile{
void write (String sn, String si, String ss, String se, String sc, String sd, int b){
   
   File file = new File("projek.txt");
           FileWriter fr = null;
           BufferedWriter br = null;
           PrintWriter pr = null;
           String input = "name: "+ sn+"\n";
           input += "telephone number: " + si+"\n";
           input += "from: " + ss +" ";
           input += "untill: " + se+"\n";
           input += "court: " + sc+"\n";
           input += "date: " + sd+"\n";
           input += "total price: RM" + b + "." + "\n";
        try{
           
            
         fr = new FileWriter(file, true);
         br = new BufferedWriter(fr);
         pr = new PrintWriter(br);
         pr.println(input);
        }catch(IOException e){
            System.out.println(""+e);
        }finally {
         try {
            pr.close();
            br.close();
            fr.close();
            
         } catch (IOException e) {
             JOptionPane.showMessageDialog(null,"tetttt");
         }}
         
         
        }
    }  
   
