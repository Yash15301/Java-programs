class abc
{
	public static void main(String args[])
	{
		try
		{
			int no1=0;
			int no2=17/no1;
		}catch(Exception e)
		{
			System.out.println("option x");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("option y");
		}
	}
}