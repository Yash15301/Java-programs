class abc
{
	//int a,b;
    int a=1,b=2;	
void s()
	{
 	
	System.out.println(+(a+b));
}
void s1()
{
	 a=5;
	
	System.out.println(+(a*b));
	int z=9;
	System.out.println(z);
	System.out.println(a);
}
void s2()
{
	int c=40;
	System.out.println(+(c+b));
}

public static void main(String args[])
{
	abc a1=new abc();
	a1.a=20;
	a1.b=10;
	a1.s();
	a1.s1();
	a1.s2();
}
}