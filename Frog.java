public class Frog
{
public static void main(String[]args)
{
int area=50;
int up=5;
int down=3;
int days=0;
while(area>0)
{
//System.out.println(area);
area=area-up+down;
days++;
}
System.out.println(days);
}
}