import java.util.*;
class abc
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,fact=2;
		System.out.println("enter a number");
		n=sc.nextInt();
		
		if(n==1)
		{
			System.out.println("1");
		}
		
		else
		{
			while(fact<=n)
			{
				
			if(n%fact==0)
			{
				System.out.print(fact+",");
				n=n/fact;
			}
			
			else
			{
				
				fact++;
			}	
			}
			
				
		}
	}
}