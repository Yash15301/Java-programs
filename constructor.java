class abc
{
	int a=10;
	int x=10,b=20;
	
	abc()
	{
	System.out.println(a);
	}
	
	abc(int x,int y)
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
		abc a2=new abc(10,20);
		
	}
}