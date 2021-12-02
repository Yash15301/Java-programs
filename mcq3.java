class abc
{
	public static void main(String args[])
	{
		/*StringBuilder s1=new StringBuilder ("java");
		String s2=s1.toString();
		String s3=s1.toString();
		System.out.println(s2);
		StringBuilder s4=s1;
		System.out.println(s3);
		System.out.println((s2==s3)+""+(s1==s4));*/
		String s1="abc";
		String s2="abc";
		System.out.println((s1==s2));
		StringBuilder s3=new StringBuilder("abc");
		String s4=s1.toString();
		String s5=s1.toString();
		System.out.println(s4);
		System.out.println((s4==s5));
		
	}
}