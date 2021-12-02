class ExceptionThrow
{
	static void calculate(int a,int b) throws ArithmeticException
	{
		int c;
		try
		{
			c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("error detected:"+e);
		}
	}
	
	public static void main(String args [])
	{
		calculate(5,0);
	}
	
}