class abc
{
	abc()
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