class abc
{
	public static void main(String args[])
	{
		int i;
		String s1=new String("boo:and:foo");
		String s2[] =s1.split(":");
		int a=s1.length();
		System.out.println(a);
		for(i=0;i<11;i++)
		{
		System.out.println(s2[i]);
		}
	}
}