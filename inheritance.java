class abc extends xyz
{
	
	int a=10;
	int b=20;
	void s()
	{
	System.out.println(+(a+b));
	}
}



class xyz  extends abc
{
   
	int a=5;
	int b=10;
	void s1()
	{
	System.out.println(+(a+b));
	}
	
}



class a
{
public static void main(String args[])
{
	abc a1=new abc();
	xyz x1=new xyz();
	a1.s1();
	//x1.s();
}
}