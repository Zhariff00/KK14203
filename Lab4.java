import java.util.Scanner;

class Menu{
   private String item;
   private double price;
   
   Menu(String i, double p){
      item = i;
      price = p;   
   }
   
   String getItem(){
      return item;
   }
   
   double getPrice(){
      return price;
   }
   
   void setItem(String item){
        this.item = item; 
   }
   
   void setPrice(double price){
      this.price = price; 
   }
   
   String getMenuItem(){
       return (item + " RM" + String.format("%.2f", price));  
   }
   
   double calcPrice(int quantity){
      return ((double)(price*quantity));   
   }
}

class Orders{ 
   private int m_id; 
   private String m_Name; 
   private int o_Quantity; 
   private double subTotal; 
      
   Orders(int id, String name, int quantity, double subto){ 
      m_id = id;
      m_Name = name;
      o_Quantity = quantity;
      subTotal = subto;
   }
   
   void print(){
      System.out.println(m_id + " \t" + m_Name + " \t\t" + o_Quantity + " \t\tRM" + subTotal);
   }
   
   double getSubTotal(){
      return subTotal;
   }
   
   //accessor & mutator   
}

public class Lab4 {
   public static void main(String args[]) throws java.io.IOException{
      char choice;
      int qty;
      double total=0.0;
      Scanner scan = new Scanner(System.in);
      Menu [] obj = new Menu[4];
      //initialize menu
      String [] mn = {"Nasi Lemak", "Roti", "Teh Tarik", "Kopi"};
      double [] mp = {2.0, 1.0, 1.5, 2.0};
      for (int i =0; i<mn.length; i++){
          obj[i]= new Menu(mn[i], mp[i]);
      }
      //print menu
      System.out.println("Menu Order System");
         
      System.out.println("----------------------------------------------");  
      for(int i =0; i<mn.length; i++){
          System.out.println("[" +i +"] " + obj[i].getMenuItem());
      }
      System.out.println("Press n for new order | q to exit.");
         
      do{
         System.out.print("Add order: ");
         choice = (char) System.in.read();
         switch(choice){
            case '0':
               System.out.print("\t" + obj[0].getItem() + " - ");
               System.out.print("Quantity: ");
               qty = scan.nextInt();
               total += (obj[0].calcPrice(qty));
               System.out.println("\tPrice: RM" + obj[0].calcPrice(qty) + "\n");
               break;
            case '1':
               System.out.print("\t" + obj[1].getItem() + " - ");
               System.out.print("Quantity: ");
               qty = scan.nextInt();
               total += (obj[1].calcPrice(qty));
               System.out.println("\tPrice: RM" + obj[1].calcPrice(qty) + "\n");
               break;
            case '2':
               System.out.print("\t" + obj[2].getItem() + " - ");
               System.out.print("Quantity: ");
               qty = scan.nextInt();
               total += (obj[2].calcPrice(qty));
               System.out.println("\tPrice: RM" + obj[2].calcPrice(qty) + "\n");
               break;
               
            case '3':
                System.out.print("\t" + obj[3].getItem() + " _ ");
                System.out.print("Quantity: ");
                qty = scan.nextInt();
                total += (obj[3].calcPrice(qty));
                System.out.println("\tPrice RM" + obj[3].calcPrice(qty) + "\n");
                break;
         }
      } while (choice!='q');       
      
      System.out.println("\nThank you for your order.");
      System.out.printf("Total due: RM %.2f", total);
            
   }
}