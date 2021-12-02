class abc
{
	void s()
	{
		int a=10;
		System.out.println(a);
	}
}

class xyz extends abc
{
	void s()
	{
		int b=20;
		System.out.println(b);
		
	}
}

class a
{
	public static void main(String args[])
	{
		abc a1=new abc();
		xyz x1=new xyz();
		abc a2=new xyz();
		//xyz x2=new abc();
		a1.s();
		x1.s();
		a2.s();
	}
}
	