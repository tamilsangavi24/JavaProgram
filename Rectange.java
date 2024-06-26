public class Rectangle
{
int length;
int breadth;
double weight;
Rectangle(){
System.out.println("Constructor with zero parameter");
}
Rectangle(int l){
length=l;
System.out.println("Constructor with 1 parameter");
System.out.println("Rectangle length:" +length);}
Rectangle(int l, int b)
{
length=l;
breadth=b;
System.out.println("Constructor with 2 parameter");
System.out.println("Rectangle length:" +length);
System.out.println("Rectangle Breadth:"+breadth);
}
Rectangle(int l, double w)
{
length=l;
weight=w;
System.out.println("Constructor with mixed datatype");
System.out.println("Rectangle length:" +length);
System.out.println("Rectangle Breadth:"+weight);
}
public static void main (String[] args)
{
Rectangle r1 = new Rectangle();
Rectangle r1 = new Rectangle(20);
Rectangle r1 = new Rectangle(50,77);
\\Rectangle r1 = new Rectangle(22,10.8);
}
}
