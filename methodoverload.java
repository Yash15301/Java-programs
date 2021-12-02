class abc
{
	int x=50,y=100,p=1,q=2;
	void s()
	{
		int a=10,b=10;
		System.out.println(+(a+b));
	}
	void s(int x)
	{
		int c=20,d=20;
		System.out.println(+(c+d));
	}
	void s(int p,int q)
	{
		int e=30,f=30;
		System.out.println(+(e+f));
	}
	
}
class a
{
	public static void main(String[]args)
	{
		abc a1=new abc();
		a1.s();
		a1.s(50);
		a1.s(1,2);
		
	}
}