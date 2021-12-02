class abc
{
	void s()
	{
	final int a=10;
	a++;
	System.out.println(a);
	}
}

class xyz
{
	void s1()
	{
		int a=20;
		System.out.println(a);
	}
}
class a 
{
	public static void main(String args [])
	{
		abc a1=new abc();
		xyz x1=new xyz();
		a1.s();
		x1.s1();
	}
}