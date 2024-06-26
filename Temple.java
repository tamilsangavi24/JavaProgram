/*public class Temple{
public static void main(String[]args){
int a=256;
while(a>1){
System.out.println(a/2);
a=a/2;
}
}
}*/



class Temple
{
public static void main (String args[])
{
int flower =2;
int temple =128;
int count =0;
int No_temp =7;
int home=1;
System.out.println("home total flower "+home);

while(home<temple)
{
System.out.println("Temple " + No_temp); //128

System.out.println("no_flower" +temple );//1
 temple=temple/2;
count++;
No_temp--;

}
System.out.println(count);
}
}
