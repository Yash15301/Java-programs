interface a
{
	void s();
	void s1();
	void s2();
}

public class interface implements a
{
	public void s()
	{
		int a=10;
		System.out.println(a);
	}
	
	public void s1()
	{
		int b=20;
		System.out.println(b);
	}
	
	public void s2()
	{
		int c=30;
		System.out.println(c);
	}
	
}

class c
{
	public static void main(String args[])
	{
		b b1=new b();
		b1.s();
		b1.s1();
		b1.s2();
	}
}