interface a
{
	int a=4;
	void s1();
	void s2();
		
}

interface b
{
	int a=6;
	void s3();
	void s4();
}

class c implements a,b
{
	public void s1()
	{
		int a=10;
		System.out.println(a);
	}
	
	public void s2()
	{
		int b=20;
		System.out.println(b);
	}
	
	public void s3()
	{
		int c=30;
		System.out.println(c);
	}
	
	public void s4()
	{
		int d=40;
		System.out.println(d);
	}
}

class d
{
	public static void main(String args [])
	{
		c c1=new c();
		c1.s1();
		c1.s2();
		c1.s3();
		c1.s4();
	}
}