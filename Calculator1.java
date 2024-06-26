public class Calculator1
{
public static void main(String[] args)
{
Calculator1 calculate=new Calculator1();
int res=calculate.add();
System.out.println(calculate.add());
 float result1=calculate.divide();
	System.out.println(calculate.divide());
	long mark=calculate.subtract();
	System.out.println(calculate.subtract());
	byte mark1=calculate.multiply();
	System.out.println(calculate.multiply());
}
public int add(){
System.out.println("Add-method");
int result=10+20;
return result;
}
public static float divide(){
System.out.println("static-method");
	float result1=0.9f/0.4f;
	return result1;
}
	public static long subtract(){
	System.out.println("sub");
	long mark=998989l-985665l;
	return mark;
	}
	public static byte multiply(){
		System.out.println("*");
			byte mark1=9*1;
		return mark1;
	}
}