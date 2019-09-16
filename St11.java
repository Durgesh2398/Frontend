package javaa;
import java.util.*;
public class St11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub/*
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int arr[]=new int[m];
		
		for(int i=0;i<m;i++)
		{
		    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int sum=arr[0];
		int a=arr.length;
		for(int i=0;i<a-1;i++)
		{
		    if(arr[i]!=arr[i+1])
		    {
		        sum=sum+arr[i+1];
		    }
		}
		System.out.println(sum);

/*		static int findSum(int arr[], int n) { 
	        Arrays.sort(arr); 
	        int sum = arr[0]; 
	        for (int i = 0; i < n-1; i++) { 
	            if (arr[i] != arr[i + 1]) { 
	                sum = sum + arr[i+1]; 
	            } 
	        } 
	        return sum; 
	    }   
	    public static void main(String[] args) { 
	        Scanner sc =new Scanner(System.in);
	        int m=sc.nextInt();
	    	int arr[] = new int[m];
	    	for(int i=0;i<m;i++)
	    	{
	    		arr[i]=sc.nextInt();
	    	}
	        int n = arr.length; 
	        System.out.println(findSum(arr, n));*/
	}
}
