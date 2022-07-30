package dsa;
import java.util.*;
public class binarysearch {
static int binary(int [] ar,int search,int low,int high)
{
	int find=search;
	if(low>high)
	{
		System.out.println("element didnt found");
		return 0;
	}
	int mid=(high+low)/2;
	if(ar[mid]>find)
	{
		int lo=low;
		int hig=mid-1;
		binary(ar,find,lo,hig);
	}
	else if(ar[mid]<find) {
		int lo=mid+1;
		int hi=ar.length-1;
		binary(ar,find,lo,hi);
	}
	else if(ar[mid]==find)
	{
		System.out.println("element found at index"+mid);
		return mid;
	}
	else {
		return 0;
	}
	return 0;
	
	
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements in the array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		Arrays.sort(ar);
		System.out.println("enter the element to search");
		int search=sc.nextInt();
		int low=0;
		int high=ar.length-1;
		int v=binary(ar,search,low,high);
		if(v!=0)
		{
			System.out.println("the element found at "+ v);
		}

	}

}
