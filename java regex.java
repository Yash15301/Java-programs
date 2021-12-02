import java.util.*;
import java.io.*;
class check1
{
	boolean isInteger=isInteger(ip[1]);
	if(isInteger==false)
	{
		System.out.println("wrong input");
	}
}

class check2
{
	int counter;
	for(int i=0;i<=ip.length();i++)
	{
		counter=i+1;
		if(ip[i]=='.')
		{
			counter=0;
		}
		
		if(counter>3)
		{
			System.out.println("incorrect ip");
		}
	}
}
class abc
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your ip to validate");
		String ip[]=sc.next();
		
	}
}