package dsa;
import java.util.*;
public class coins {
	static int coins[]=new int[100];
	static int x,y=0;
	static int[] pass(int i,int l)
	{
		coins[i]=l;
		return coins;
	}
static int[] makechange(int[]deno,int n)
{
	Arrays.sort(deno);
	for(int i=deno.length-1;i>=0;i++)
	{
		int l=n/i;
		pass(i,l);
		n=n%i;
	}
	return coins;
}
	public static void main(String[] args) {
		System.out.println("enter the rupees for changes");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []deno= {1, 2, 5, 10, 20,50, 100, 500, 1000};
		makechange(deno,n);
		for(int i=0;i<deno.length;i++)
		{
			System.out.println("the denomiantion of"+i+"are"+coins[i]);
		}
		

	}

}
