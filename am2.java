class abc
{
private void s()
{
	int a=10,b=10;
	System.out.println(+(a+b));
	
}	
}

class xyz extends abc
{
	private void s1()
	{
	int x=50;
	System.out.println(x);
	}
}

class a 
{
	public static void main(String args[])
	{
		abc a1=new abc();
		xyz x1=new xyz();
		x1.s();
		x1.s1();
		a1.s();
	}
}