import java.util.*;
class abc
{
	public static void main(String args[])
	{
		int n1 = (int)(Math.random()*10);
		int n2 = (int)(Math.random()*10);
		int n3 = (int)(Math.random()*10);
		int n4 = (int)(Math.random()*10);
		
		int c1 = 65 + (int)(Math.random()*25);
		int c2 = 65 + (int)(Math.random()*25);
		int c3 = 65 + (int)(Math.random()*25);
		
		
		System.out.print((char)c1);
		System.out.print((char)c2);
		System.out.print((char)c3);
		System.out.print(n1);
		System.out.print(n2);
		System.out.print(n3);
		System.out.print(n4);
	}
}