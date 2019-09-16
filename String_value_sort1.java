package javaa;

import java.util.Scanner;

public class String_value_sort1 {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		String[] animal=new String[3];
		String[] fruit=new String[3];
		
		System.out.println("Enter values in animal");
		for(int i=0;i<=2;i++)
		{
			animal[i]=sc.nextLine();
		}
		
		System.out.println("Enter values of fruit");
		for(int i=0;i<=2;i++)
		{
			fruit[i]=sc.nextLine();
		}
		
		String min=null;
		int loc =0;
		
		for(int i=0;i<animal.length-2;i++)
		{
			min=animal[i];
			loc=i;
			for(int j=i+1;j<=animal.length-1;j++)
			{
				if(animal[j].compareTo(min)<0)
				{
					min=animal[j];
					loc=j;
				}
			}
			if(loc!=i)
			{
				String temp =animal[loc];
				animal[loc]=animal[i];
				animal[i]=temp;
			}
		}
		for(int i=0;i<=2;i++)
		{
			System.out.println(animal[i]);
		}
		
		String min1=null;
		int loc1 =0;
		
		for(int i=0;i<fruit.length-2;i++)
		{
			min1=fruit[i];
			loc1=i;
			for(int j=i+1;j<=fruit.length-1;j++)
			{
				if(fruit[j].compareTo(min)<0)
				{
					min1=fruit[j];
					loc1=j;
				}
			}
			if(loc1!=i)
			{
				String temp =fruit[loc1];
				fruit[loc1]=fruit[i];
				fruit[i]=temp;
			}
		}
		
		for(int i=0;i<=2;i++)
		{
			System.out.println(fruit[i]);
		}
	}
}
