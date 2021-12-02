interface pinfo
{
	public void dob();
	public void email();
}

class yash implements pinfo
{
	public void dob()
	{
		System.out.println("15-march-2001");
	}
	
	public void email()
	{
		System.out.println("yashnanavati2001@gmail.com");
	}
}

class yash1 implements pinfo
{
	public void dob()
	{
		System.out.println("15-march-2001");
	}
	public void email()
	{
		System.out.println("beingyolo2001@gmail.com");
	}
}

class abc
{
	public static void main(String args[])
	{
		yash y1=new yash();
		yash1 y2=new yash1();
		y1.dob();
		y1.email();
		y2.dob();
		y2.email();
	}
}