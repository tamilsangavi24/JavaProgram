/*public class PocketMoney{
public static void main(String[]args){
int startingamount=1;
int days=10;
int totalamount=0;
int dailyamount=startingamount;
int currentday=1;
while(currentday<=days){
  System.out.println("day"+currentday+":"+dailyamount+".rupees");
  totalamount+=dailyamount;
  dailyamount++;
  currentday++;
}
System.out.println("total pocket money after"+days+"days:"+totalamount+"rupees");
}
}*/

class PocketMoney
{
public static  void main (String args[])
{
int days =5;
int count=0;
int father =1;
//int P_m=1;
while (days>=father) 
{
count=count+father;
System.out.println(father);
++father;
}
System.out.println("Apr 21 to 25 got money "+count);
System.out.println("message got 5 days extended shool");
int last_day=10;
int count2 =0;
int daugher =6;
//int daughter=6;
while (last_day>=daugher)
{
count2=count2+daugher;
System.out.println(daugher);
++daugher;
}
System.out.println("Apr 26 to 30 got money "+count2);
int Totall = count2+count;
System.out.println("Apr 21 to 30 "+ Totall);
if (count>=count2) 
{
System.out.println("father is smarter");
}else
{
System.out.println("daughter is smarter");
}
}
}
