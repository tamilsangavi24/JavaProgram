public class Calculator
{
public static void main(String[] args)
{
Calculator calculate=new Calculator();
int res=calculate.add();
System.out.println(calculate.add());
calculate.divide();
}
public int add(){
System.out.println("Add-method");
int result=10+20;
return result;
}
public static void divide(){
System.out.println("static-method");
}
}