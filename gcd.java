package dsa;
import java.util.*;
public class gcd {
static void gd(int a,int b)
{
	int result=Math.min(a, b);
	while(true)
	{
	if((a%result==0 )&& ( b%result==0))
	{
		System.out.println("the gcd of two numbers " +a+ " " +b+" "+"is " +result);
		break;
	}
	else
		result--;
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		gd(a,b);

	}

}
