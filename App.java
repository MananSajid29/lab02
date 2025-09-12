public class App{
      private String productName;
      private int productId;
      private double price;
      private boolean stockAvb;
      

   public App(){
     
          productName = "Rice";
          productId = 24;
            price = 250.56;
            stockAvb = true ;
}

  public App(String name , int id , double cost , boolean check)
{

    productName = name ;
    productId = id ;
    price  = cost;
    stockAvb = check;
}

public void setProductName(String n){
     productName = n;
}
public String getProductName(){
     return productName;
}
public void setProductId(int i){
     productId = i;
}
public int getProductId(){
   return productId;
}
public void setPrice(double p){
    price = p;
}
public double getPrice(){
    return price;
}
public void setStockAvb(boolean b){
      stockAvb = b ;
}
public boolean getStockAvb(){
       return stockAvb;
}


public void display(){

   System.out.println("Product Name     : " +productName);
   System.out.println("Product ID       : " +productId);
   System.out.println("Product price    : " +price);
   System.out.println("Product StockAvb : " +stockAvb);
}
}

     
    
















 