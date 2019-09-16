/*
 * write a program to find the maximum occuring string in a string array
 * case 1 "amit", "amit", "amit", "ajit", "bhanu", "amit"
 * ans = amit
 * case 2 "amit", "amit", "amit", "bhanu", "bhanu", "bhanu"
 * ans = bhanu
 * case 2 "amit", "bhanu", "jay", "ajit", "nitin"
 * ans = nitin
*/
package javaa;
import java.util.*;
public class Stringno {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[]= new String [n];
		arr[n]=sc.nextLine();
		Arrays.sort(arr);
		int max =0,count =0;
		String result=" ";
		for(int i=0;i<(n-1);)
		{
			count = 0;
			int j=i;
			while(arr[j].equals(arr[j+1]))
			{
				count++;
				j++;
			}
			if(count>=max)
			{
				max = count;
				result = arr[i];
			}
			i=i+count;
		}
	}
}
