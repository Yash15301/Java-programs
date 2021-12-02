import java.util.*;
import java.io.*;

class abc
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int number = sc.nextInt();
		int temp = number;
		int digit = 0;
		while(temp>0)
		{
			digit = temp%10;
			System.out.println(digit);
			temp = temp/10;
		}
	}
}