package javaa;
class RecDemo{
	public int rec(int i) {
		int result =0;
		if(i==1)
			//if(i==5)
		{
			return 1;
			//return 5;
		}
		else {
			//result = rec(i+1);
			result =i*rec(i-1);
			//System.out.println(result);
			//return i;
			return result;
		}
	}
}
public class Reacursion {
	public static void main(String args[])
	{
		RecDemo r =new RecDemo();
		int result=r.rec(10);
		//int result=r.rec(1);
		System.out.println(result);
	}
}
