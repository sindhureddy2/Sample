package Addition;
import java.util.Scanner;
public class Simple {
	public static void main(String args[]) {
	int x,y;
	Scanner in=new Scanner(System.in);
	System.out.println("first:");
	x=in.nextInt();
	System.out.println("second:");
	y=in.nextInt();
	while(y!=0)
	{
		int w=x & y;
		x=x^y;
		y=w<<1;
		
	}
	System.out.println("sum:"+x);
	System.out.println("\n");
	}
	

}


