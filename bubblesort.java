package dsa;

import java.util.Scanner;

public class bubblesort {
	static int[]sort(int[] ar)
	{
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]>ar[i+1])
			{
				int temp=ar[i+1];
				ar[i+1]=ar[i];
				ar[i]=temp;
				
			}
		}
		return ar;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		ar=sort(ar);
		System.out.println("Sorted list is");
		for(int i=0;i<n;i++)
		{
			System.out.println(ar[i]);
		}
		sc.close();

	}

}
