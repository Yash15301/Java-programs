import java.util.*;
public class order
{
	public static void main(String [] args)
	{
		int a,b,c,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("enter value for a,b,c");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		
		if(a<b || a<c)
		{
			if(a<b)
			{
				temp=a;
				a=b;
				b=temp;
			}
			if(a<c)
			{
				temp=a;
				a=c;
				c=temp;
			}
		}
		
		if(b<c)
		{
			temp=b;
			b=c;
			c=temp;
		}
		
		System.out.println("sorted values are:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}