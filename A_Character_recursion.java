package javaa;
import java.util.*;
public class A_Character_recursion {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str;
		str=sc.nextLine();
		System.out.println(str);
		boolean a=true;
		boolean b=false;
		String up=hasuppercase(str);
	}
	public static String hasuppercase(String up)
	{
		if(up.isEmpty())
		{
			return false;
		}
		else if(up.charAt(0)>=65 && up.charAt(91)<=91)
		{
			return true;
		}
		else 
		{
			return hasuppercase(up.substring(1));
		}
	}
}