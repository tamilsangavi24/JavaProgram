public class SuperMarket
{
 public SuperMarket(String name,int price){
  System.out.println("Are you constructor");
  prod_name = name;
  prod_price = price;
 }
 
 public SuperMarket(){
  System.out.println("Are you no-arg constructor");
 }

 static String shop_name="More";
 static int no = 40;
 
 String prod_name;
 int prod_price;

 
public static void main(String[] args)
{
 SuperMarket prod = new SuperMarket();
 SuperMarket prod1 = new SuperMarket("abc",40);
  System.out.println(prod1.prod_name);
  System.out.println(prod1.prod_price);
 
 SuperMarket prod2 = new SuperMarket("bcd",55);
  System.out.println(prod2.prod_name);
  System.out.println(prod2.prod_price);
 
 SuperMarket prod3 = new SuperMarket("cde",80);
  System.out.println(prod3.prod_name);
  System.out.println(prod3.prod_price);
 
 
}


}
	