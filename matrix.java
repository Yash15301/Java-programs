import java.util.*;
class abc
{
	public static void main(String [] args)
	{
		int a[][]=new int [6][6];
		System.out.println("your matrix is:");
		
		int i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				a[i][j]=(int)(Math.random()*2);
			}
		}
		
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+"      ");
			}
			System.out.println();
		}
		
		
		System.out.println("----------------------------------------------------------------");
		Checkrow(a);
		System.out.println("----------------------------------------------------------------");
		Checkcolumn(a);
    }
		
		
		public static void Checkrow(int matrix[][])
		{
			int count,i,j;
			
			for(i=0;i<matrix.length;i++)
			{
				count=0;
				for(j=0;j<matrix.length;j++)
				{
					if(matrix[i][j]==1)
					{
						count++;
					}
				}
				if(count%2==0)
				{
					System.out.println("row "+(i+1)+"has even number of 1's");
				}
				
			}
		}
		
		
		public static void Checkcolumn(int matrix[][])
		{
			int count,i,j;
			for(j=0;j<matrix.length;j++)
			{
				count=0;
				for(i=0;i<matrix.length;i++)
				{
					if(matrix[i][j]==1)
					{
						count++;
					}
				}
				if(count%2==0)
				{
					System.out.println("column "+(j+1)+"has even numbers of 1's");
				}
			}
		}
}