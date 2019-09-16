package javaa;
import java.util.*;
public class Sorting {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int arr[]=new int[m];
		for(int i=0;i<m;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m-i-1;j++)
			{
				if(arr[j]>arr[j-1])
				{
					int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp;
				}
			}
		}
		for(int i=0;i<m;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
