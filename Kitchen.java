public class Kitchen
{
static String Kitchen_name="Appa";
String chef="Amma";
public static void main(String[] args)
{
 Kitchen robo=new Kitchen();
 robo.biriyani();
 int no=40;
 System.out.println(no);
 System.out.println(Kitchen.Kitchen_name);
 System.out.println(robo.chef);
}
public void biriyani()
{
    System.out.println("biriyani ready");
}
}