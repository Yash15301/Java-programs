abstract class abc
{
	abstract void s();
	
}

class xyz extends abc
{
	 void s()
	{
		int x=50;
		System.out.println(x);
	}
}

class a
{
	public static void main(String args [])
	{
		xyz x1=new xyz();
		x1.s();
		
		
		
	}
}