class abc extends pqr 
{
	
	int a=10;
	int b=20;
	void s()
	{
	System.out.println(+(a+b));
	}
}



class xyz  extends pqr
{
   
	int a=5;
	int b=10;
	void s1()
	{
	System.out.println(+(a+b));
	}
	
}



class pqr 
{
	int a=100,b=20;
	void s2()
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
	pqr p1=new pqr();
	a1.s2();
	a1.s2();
	p1.s2();
}
}