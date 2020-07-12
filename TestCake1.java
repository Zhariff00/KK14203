    abstract class Cake {
    String name;
    String [] topping;
    String [] toppingOrder;
    double priceSmall; double priceMedium; double priceBig, totalPrice;
    int size; int quantity;
    Cake (String name){
        this.name = name;
    }
    abstract void setCake (String [] topping, double priceSmall, double priceMedium, double priceBig);
   
    void orderCake (String [] toppingOrder, int quantity, int size){
        this.toppingOrder = toppingOrder ;
        this.quantity = quantity;
        this.size = size;
    } 
    double getSizePrice (int size){
        if (size==1) {return priceSmall;}
        else if (size==2){return priceMedium;}
        else if (size==3){return priceBig;}
        else return 0;
    }
    double getTotalPrice (){
        double totalPrice = getSizePrice(size)*quantity+(toppingOrder.length*10);
        return totalPrice;
    }
    String getSize (){
        if (size==1)return "small";
        else if (size==2)return "medium";
        else if (size==3)return "big";
        else return "invalid";
    }
    void printCake(){
        System.out.println(name+" cake with available topping: ");
        for(int i=0;i<topping.length;i++){
            System.out.println(i+1+") " + topping[i]);
        }
        System.out.println("small: RM 45");
        System.out.println("medium: RM 65");
        System.out.println("big: RM 80");
    }
    void printOrder(){
        System.out.println("topping: ");
        for (int i =0; i<toppingOrder.length; i++){
            System.out.println(i+1+") " + toppingOrder[i]);
        }
        System.out.println("size: " + getSize());
        System.out.println("total price: RM" + getTotalPrice());
    }
}
    class BlackForest extends Cake {
        BlackForest (String name ){
            super (name);
    }

        void setCake (String [] topping, double priceSmall, double priceMedium, double priceBig){
        this.topping = topping;
        this.priceSmall = priceSmall;
        this.priceMedium = priceMedium;
        this.priceBig = priceBig;
    }
}    
    public class TestCake1{
        public static void main(String args[]){
            Cake c = new BlackForest("BlackForest");
            String[] topping = {"Chocolate", "Cherries", "Whipped Cream"};
            c.setCake(topping, 45.00, 65.00, 80.00);
            c.printCake();
            String[] order = {"Chocolate", "Cherries"};
            c.orderCake(order, 1, 2);
            c.printOrder(); 
    } 
}
    
