class abc
{
	int s=3,t=4;
	abc(int s, int t)
	{
		int a=10;
		System.out.println(a);
	}
	
}

class xyz extends abc
{
	int p=1,q=2;
	xyz(int p,int q)
	{
		super(3,4);
		
		
		int b=20;
		System.out.println(b);
	}
}

class a 
{
	public static void main(String args[])
	{
		xyz x1=new xyz(1,2);
		
	}
}