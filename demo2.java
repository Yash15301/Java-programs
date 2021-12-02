class abc
{
	public static void main(String args [])
	{
		int a,b,c;
			a=10;
		
		
		try
		{
			
			c=a/0;
		}
		catch(ArithmeticException e)
		{
			
				System.out.println("cannot divide by zero");
			
		}
	}
}