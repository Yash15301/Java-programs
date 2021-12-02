import java.util.*;
class abc
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enter second number");
		b=sc.nextInt();
		System.out.println("GCD of is:"+gcd(a,b));
	}
	
	public static int gcd(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		else
		{
			return gcd(b,a%b);
		}
	}
}