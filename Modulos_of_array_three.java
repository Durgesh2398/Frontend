package javaa;
import java.util.*;
public class Modulos_of_array_three {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int arr[]= new int[m];
		if(m%3!=0)
		{
			System.out.println("enter a multiple of 3");
		}
		if(m%3==0)
		{
			System.out.println("enter the values");
			for(int i=0;i<m;i++)
			{
				arr[i]=sc.nextInt();
			}
		}
		int a,b;
		if(m)
		int arrr[][]=new int[a][b];
		Arrays.sort(arr);
		for(int i=0;i<m;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}