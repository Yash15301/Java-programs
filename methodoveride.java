class abc 
{
	int a=10,b=10;
	void s()
	{
		System.out.println(+(a+b));
	}
}

class xyz extends abc
{
	int x=20,y=20;
	void s()
	{
		System.out.println(+(x+y));
		super.s();
	}
}

class a
{
public static void main(String args[])
{
	abc a1=new abc();
	xyz x1=new xyz();
	x1.s();
}
}