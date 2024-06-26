public class Games
{
public static void main(String[]args){
	Games play=new Games();
	int n=play.cricket(20);
	play.kabaddi(8,9);
	play.hockey('h');
	play.cards(true);
	play.tennis("abcd");
	}
		public int cricket(int cricket){
			System.out.println(20);
			return 20;
		}
		public int kabaddi(int a,int b){
			System.out.println(a+b);
			return a+b; 
		}
	public char hockey(char s){
	System.out.println(s);
		return s;
		}
public boolean cards(boolean m){
System.out.println(m);
	return m;
	}
	public String tennis(String rt){
		System.out.println(rt);
		return rt;
	}
}
	