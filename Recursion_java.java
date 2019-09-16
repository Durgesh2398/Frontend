package javaa;
import java.util.*;
public class Recursion_java {
	public static void main(String[] args){
		String str;
		Scanner sc =new Scanner(System.in);
		str=sc.nextLine();
		String rev=reverseString(str);
		System.out.println(rev);
	}
		public static String reverseString(String rev)
		{
			if(rev.isEmpty())
			{
				return rev;
			}
			else{
				return reverseString(rev.substring(1)) + rev.charAt(0);
		}
	}
}
