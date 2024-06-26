public class Calculator2
{
public static void main(String args[])
{
 Calculator2 cal = new Calculator2();
 int result = cal.add(10,20);
 cal.divide(result);
 cal.divide(result,5);
 cal.add(10,20,30);
 cal.add(10,20,10.5);
 }
public void add(int no1,int no2,double no3){
 
}
public void add(int no1,int no2,int no3){
 
}
public int add(int no1,int no2)
{
 System.out.println(no1+no2);
 //int res = no1+no2;
 return no1+no2;
} 
public void divide(int re){
 
}
public void divide(int res,int no){
 System.out.println(res/no);
}
 }