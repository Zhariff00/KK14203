

public class calculateBill 
{
   String Type = " ";
   int total=0;
   int tempohHour=0;
   void getType(String t, int th){
   this.Type = t; 
   this.tempohHour = th; 
  }
   public int type (){
   switch(Type){
    
   case ("futsal court (RM 80 per hour)"):total = type(tempohHour, 80); break;
   case ("badminton court (RM 50 per hour)"): total =type(tempohHour, 50);break;
   case ("basketball court (RM 60 per hour)"): total =type(tempohHour, 60);break; 
   case ("takraw court (RM 40 per hour)"): total =type(tempohHour, 40);break;
   
    }
    return total;
  }
   public int type(int hour, int pricePerHour){
    int total=0;
    total = hour*pricePerHour;
       
    return total;
    }
}
