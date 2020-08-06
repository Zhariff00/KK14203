
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.swing.JOptionPane;

class court {
   String s=" ";
   String e=" ";

   void getStart(String x, String y){
      this.s = x;
      this.e=y;
      
   } 
   public int calcHour (){
   int startHour = Integer.parseInt(s);
   int endHour = Integer.parseInt(e);
   int total = endHour - startHour;
   return total;
   
   }
   
 }